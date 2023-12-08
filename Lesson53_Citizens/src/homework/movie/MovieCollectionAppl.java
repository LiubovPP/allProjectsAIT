package homework.movie;

import homework.movie.dao.MoviesCollection;
import homework.movie.dao.MoviesCollectionImpl;
import homework.movie.model.Movie;

import java.time.LocalDate;
import java.util.List;

public class MovieCollectionAppl {


        public static void main(String[] args) {
            MoviesCollection moviesCollection;

            moviesCollection = new MoviesCollectionImpl(List.of(
                    new Movie(1, "The Shawshank Redemption", "Francis Ford Coppola", "Drama", LocalDate.of(1994,9,13)),
                    new Movie(2, "The Godfather", "Francis Ford Coppola", "Drama", LocalDate.of(1972,9,13)),
                    new Movie(3, "The Dark Knight", "Christopher Nolan", "Action", LocalDate.of(2008,9,13)),
                    new Movie(4, "The Godfather Part II", "Francis Ford Coppola", "Drama", LocalDate.of(1974,9,13)),
                    new Movie(5, "De 12 gezworenen", "Sidney Lumet", "Drama", LocalDate.of(1957,9,13)),
                    new Movie(6, "Schindler's List", "Steven Spielberg", "Drama", LocalDate.of(1993,9,13)),
                    new Movie(7, "The Lord of the Rings: The Return of the King", "Peter Jackson", "Action", LocalDate.of(2003,9,13)),
                    new Movie(8, "Pulp Fiction", "Quentin Tarantino", "Crime", LocalDate.of(1994,9,13)),
                    new Movie(9, "The Lord of the Rings: The Fellowship of the Ring", "Peter Jackson", "Action", LocalDate.of(2001,9,13)),
                    new Movie(10, "The Good, the Bad and the Ugly", "Sergio Leone", "Western", LocalDate.of(1966,9,13)),
                    new Movie(11, "Forrest Gump", "Robert Zemeckis", "Drama", LocalDate.of(1994,9,13)),
                    new Movie(12, "Fight Club", "David Fincher", "Drama", LocalDate.of(1999,9,13)),
                    new Movie(13, "The Lord of the Rings: The Two Towers", "Peter Jackson", "Action", LocalDate.of(2002,9,13)),
                    new Movie(14, "Inception", "Christopher Nolan", "Adventure", LocalDate.of(2010,9,13)),
                    new Movie(15, "Star Wars: Episode V - The Empire Strikes Back", "Irvin Kershner", "Fantasy", LocalDate.of(1980,9,13)),
                    new Movie(16, "16. The Matrix", "Lana Wachowski", "Action", LocalDate.of(1999,9,13)),
                    new Movie(17, "Goodfellas", "Martin Scorsese", "Crime", LocalDate.of(1990,9,13))


            ));
            System.out.println("===================Начальный список===========================");
            for (Object m : moviesCollection){
                System.out.println(m);
            }

            moviesCollection.addMovie(new Movie(27, "Spider-Man: Across the Spider-Verse", "Joaquim Dos Santos", "Animation", LocalDate.of(2023,1,1)));
            moviesCollection.addMovie(new Movie(35, "Gisaengchung", "Bong Joon Ho", "Drama", LocalDate.of(2019,1,1)));
            moviesCollection.addMovie(new Movie(59, "Oppenheimer", "Christopher Nolan", "Biography", LocalDate.of(2023,1,1)));
            moviesCollection.addMovie(new Movie(63, "Avengers: Infinity War", "Anthony Russo", "Actoin", LocalDate.of(2018,1,1)));

            System.out.println("===================Список с добавленными===========================");
            for (Object m : moviesCollection){
                System.out.println(m);
            }

            LocalDate from = LocalDate.now().minusYears(6);
            LocalDate to = LocalDate.now().minusYears(0);


            Iterable<Movie> movieBevin = moviesCollection.findMoviesCreatedBetweenDates(from, to);

            System.out.println("===================Список фильмов снятых за последние 5 лет===========================");
            for (Movie m : movieBevin){
                System.out.println(m);
            }



        }
}
