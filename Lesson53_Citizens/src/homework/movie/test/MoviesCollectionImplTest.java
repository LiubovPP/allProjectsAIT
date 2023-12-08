package homework.movie.test;

import homework.movie.dao.MoviesCollection;
import homework.movie.dao.MoviesCollectionImpl;
import homework.movie.model.Movie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MoviesCollectionImplTest {
    MoviesCollection moviesCollection;

    static final LocalDate now = LocalDate.now();

    @BeforeEach
    void setUp() {
        moviesCollection = new MoviesCollectionImpl(List.of(
                new Movie(1, "A", "A", "A", now.minusYears(3)),
                new Movie(2, "B", "B", "B", now.minusYears(4)),
                new Movie(3, "C", "C", "C", now.minusYears(1)),
                new Movie(4, "D", "D", "D", now.minusYears(2)),
                new Movie(5, "E", "E", "E", now.minusYears(7))
        ));
    }

    @Test
    void testConstructor(){
        // вызываем конструктор с двумя одинаковыми объектами
        moviesCollection = new MoviesCollectionImpl(List.of(
                new Movie(1, "T1","G1", "D1", now.minusYears(2)),
                new Movie(1, "T1","G1", "D1", now.minusYears(2))
        ));
        // проверяем, что добавился только один объект
        assertEquals(1,moviesCollection.totalQuantity());
    }

    @Test
    void addMovieTest() {
        assertFalse(moviesCollection.addMovie(null));
        assertFalse(moviesCollection.addMovie(new Movie(2, "B", "B", "B", now.minusYears(4)))
        );
        assertEquals(5,moviesCollection.totalQuantity());
        assertTrue(moviesCollection.addMovie(new Movie(6, "F", "B", "B", now.minusYears(8))));
        assertEquals(6,moviesCollection.totalQuantity());

    }

    @Test
    void removeMovieTest() {
//        assertFalse(moviesCollection.removeMovie(new Movie(6, "F", "B", "B", now.minusYears(8)));
//
//            assertFalse(moviesCollection.removeMovie(6));
//            assertEquals(5, moviesCollection.totalQuantity());
//            assertTrue(moviesCollection.removeMovie(5));
//            assertEquals(4, moviesCollection.totalQuantity());

            }

    @Test
    void findByIdTest() {
//        MoviesCollection movie = moviesCollection.findById(1);
//        assertEquals(1, movie.getImdb());
//        assertEquals("A", movie.getDirector());
//        assertEquals("A", movie.getGenre());
//        assertEquals(now.minusYears(3), movie.getDate());
    }

    @Test
    void findByGenreTest() {
        Iterable<Movie> movies = moviesCollection.findByGenre("X");
        String genre = "";
        int count = 0;
        for (Movie m : movies) {
            count++;
            assertTrue(m.getGenre().compareTo(genre) >= 0);
            genre = m.getGenre();
        }
        assertEquals(5, moviesCollection.totalQuantity());    }

    @Test
    void findByDirectorTest() {Iterable<Movie> movies = moviesCollection.findByDirector("X");
        String direc = "";
        int count = 0;
        for (Movie movie : movies) {
            count++;
            assertTrue(movie.getDirector().compareTo(direc) >= 0);
            direc = movie.getDirector();
        }
        assertEquals(5, moviesCollection.totalQuantity());
    }

    @Test
    void findMoviesCreatedBetweenDatesTestONE() {

        Iterable<Movie> expected = moviesCollection.findMoviesCreatedBetweenDates(now.minusYears(4), now.minusYears(0));
        System.out.println(expected.toString());
        List<Movie> actual = new ArrayList<>();
        actual.add(new Movie(1, "A", "A", "A", now.minusYears(3)));

        actual.add (new Movie(3, "C", "C", "C", now.minusYears(1)));
        actual.add  (new Movie(4, "D", "D", "D", now.minusYears(2)));
        assertIterableEquals(expected, actual);
    }

    @Test
    void findMoviesCreatedBetweenDatesTWO()
    {    assertEquals(2, ((List<Movie>) moviesCollection.findMoviesCreatedBetweenDates(now.minusYears(4), now.minusYears(1))).size());
        assertEquals(0, ((List<Movie>) moviesCollection.findMoviesCreatedBetweenDates(now.minusYears(10), now.minusYears(8))).size());
    }

    @Test
    void findMoviesCreatedBetweenDaysTestTHREE() {
        // Определение начальной и конечной дат для поиска фильмов
        LocalDate startDate = LocalDate.now().minusYears(4);
        LocalDate endDate = LocalDate.now().minusYears(1);

        // Поиск фильмов, между указанными датами
        Iterable<Movie> movies = moviesCollection.findMoviesCreatedBetweenDates(startDate, endDate);
        int count = 0; // счетчик
        for (Movie movie : movies) { // Перебор фильмов

            // Проверка, что фильмы были созданы после начальной даты или включают эту дату
            assertTrue(movie.getDate().isAfter(startDate) || movie.getDate().isEqual(startDate));

            // Проверка, что фильмы были созданы до конечной даты или включают эту дату
            assertTrue(movie.getDate().isBefore(endDate) || movie.getDate().isEqual(endDate));
            count++; // Увеличение счетчика найденных фильмов
        }
        assertEquals(3, count); // Проверка найденных фильмов, созданных между указанными датами
    }

    @Test
    void totalQuantityTest() {
        assertEquals(5, moviesCollection.totalQuantity());
    }


    }