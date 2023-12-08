package homework.movie.dao;

import homework.movie.model.Movie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class MoviesCollectionImpl implements MoviesCollection<Movie> {
    // поле для хранения объекта типа List
    private List<Movie> movies;// список фильмов

    public MoviesCollectionImpl() {
        movies = new ArrayList<>();
    }// делаем этот List уже конкретным ArrayList

    // заполняем ArrayList объектами из списка фильмов List<Movie> movies, который подаем на вход
    public MoviesCollectionImpl(List<Movie> list) {
        this();
        for (Movie m : list) {
            // movies.add(m); // метод из класса ArrayList, встроенный, см. строка 15, он не проверяет на дубликаты на
            // этапе создания коллекции , при проверке конструктора в тестах, тест не проходит

             addMovie(m); // метод из класса
        }
    }

    @Override

    public boolean addMovie(Movie movie) {
        // null не добавляем
        if(movie == null){
            return false;
        }
        // нельзя добавить фильм с таким же imdb
        if (findById(movie.getImdb()) != null){
            return false;
        }
        // или еще можно так
        if(movies.contains(movie)) {
            return false;
        }
        // добавляем фильм
        movies.add(movie); // чей метод add используется?
        return true;
    }

    @Override
    public Movie removeMovie(long imdb) {
        Movie victim = findById(imdb);
        if (victim != null) {
            movies.remove(victim);
            return victim;
        }
        return null;
    }

    @Override
    public Movie findById(long imdb) {
        // в moviesList надо найти элемент, у которого совпадает imdb с искомым
        for (Movie m : movies) {
            if(m.getImdb() == imdb) {
                return m;
            }
        }
        return null;
    }

    @Override
    public Iterable<Movie> findByGenre(String genre) {
        List<Movie> foundByGenre = new ArrayList<>();
        for (Movie m : movies) {
            if(m.getGenre().equals(genre)) {
                movies.add(m);
            }
        }
        return foundByGenre;
    }

    @Override
    public Iterable<Movie> findByDirector(String director) {

            List<Movie> foundByDirector = new ArrayList<>();
            for(Movie m : movies){
                if(m.getDirector().equals(director)){
                    movies.add(m);
                }
            }
            return foundByDirector;

    }

    @Override
    public Iterable<Movie> findMoviesCreatedBetweenDates(LocalDate from, LocalDate to) {
//        List<Movie> result = new ArrayList<>();
//
//        for (Movie movie : movies) {
//            LocalDate creationDate = movie.getDate();
//            if (creationDate != null &&creationDate.isAfter(from)&& creationDate.isBefore(to)  ) {
//                result.add(movie);
//            }
//        }

////        return result;
            List result = new ArrayList<>();
            for (Movie movie : movies) {
                LocalDate createdDate = movie.getDate();
                if (createdDate.isAfter(from) && createdDate.isBefore(to)) {
                    result.add(movie);
                }
            } return result;

    }

    @Override
    public int totalQuantity() {
        return movies.size();
    }

    @Override
    public Iterator<Movie> iterator() {
        return movies.iterator();
    }
}
