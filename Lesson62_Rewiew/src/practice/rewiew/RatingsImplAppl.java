package practice.rewiew;
//Практика в группах:
//
//        Реализуйте приложение "Reviews" согласно UML-схеме.
//
//        Создайте приложение, в котором задайте несколько отзывов (порядка 10) на несколько продуктов (3-4 продукта).
//        Каждый автор может оставить только один отзыв на каждый продукт. Отзывы получили случайное число лайков
//        от посетителей сайта в интервале от 10 до 50.
//        Рассчитайте рейтинг продуктов на основании оценок в отзывах на эти продукты.
//
//        Получите также:
//        - список продуктов, отсортированный по их рейтингу;
//        - список продуктов, отсортированный по количеству отзывов на них;
//        - список авторов, отсортированный по количеству лайков под их отзывами.

import practice.rewiew.dao.RatingsImpl;
import practice.rewiew.model.Review;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class RatingsImplAppl {
    public static void main(String[] args) {

        RatingsImpl ratings = new RatingsImpl();
        Random random = new Random();
        ArrayList<Review> reviews = new ArrayList<>(List.of(
                new Review(5, "Fine", "Cat", "Tomato", random.nextInt(1, 11)),
                new Review(2, "Bad", "Cat", "Tomato", random.nextInt(1, 11)),
                new Review(5, "very recommended", "Si", "Tomato", random.nextInt(1, 11)),
                new Review(5, "Fresh and nice", "Tine", "Orange", random.nextInt(1, 11)),
                new Review(4, "very good", "Cat", "Orange", random.nextInt(1, 11)),
                new Review(1, "fine", "Kim", "Orange", random.nextInt(1, 11)),
                new Review(3, "Fresh", "Kim", "Tomato", random.nextInt(1, 11)),
                new Review(3, "delivery was too late", "Kim", "Potato", random.nextInt(1, 11)),
                new Review(1, "tasty", "Tine", "Potato", random.nextInt(1, 11)),
                new Review(3, "tasty", "Stark", "Pizza", random.nextInt(1, 11)),
                new Review(4, "too hot", "Dave", "Pizza", random.nextInt(1, 11))
        ));
        // - список продуктов, отсортированный по их рейтингу;
        reviews.forEach(System.out::println);
        System.out.println("=====================================");
        reviews.stream().sorted(Review::compareToRating).forEach(System.out::println);
        System.out.println("=====================================");
        // еще способ
        Collections.sort(reviews, Comparator.comparingInt(Review::getRating).reversed());

        // Printing the sorted list
        for (Review review : reviews) {
            System.out.println(review);
        }

        Map<String, Double> avgRating1 = // переводим все в карту
                reviews.stream()
                        .collect(Collectors.groupingBy(Review::getProduct, // группирируем продукт - среднее ариф по рейтингу
                                Collectors.averagingDouble(Review::getRating)));

        // System.out.println(avgRating1); // распечатаем карту
        // сортируем карту
        avgRating1.entrySet().stream().sorted(Map.Entry.<String, Double>comparingByValue().reversed())// сортируем по значению
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + " average Rating"));// печать по ключу и значению
        //        - список продуктов, отсортированный по количеству отзывов на них; TODO
        System.out.println("=====================================");
        System.out.println("Product list sorted by review count:");
        Map<String, Long> productList = // переводим все в карту
                reviews.stream()
                        .map(Review::getProduct)
                        //.flatMap(Review::stream)
                        //.distinct().forEach(System.out::println);
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        productList.entrySet().stream() // берем поток ключей и значений
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed()) // сортируем по значению
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + " reviews")); // печать по ключу и значению
//        System.out.println(productList);
//// кол-во отзывов по каждому продукту:
//        long prod= reviews.stream().filter(p->p.getProduct().equalsIgnoreCase("Tomato")).count();
//        long prodO= reviews.stream().filter(p->p.getProduct().equalsIgnoreCase("Orange")).count();
//        long prodP= reviews.stream().filter(p->p.getProduct().equalsIgnoreCase("Potato")).count();
//        long prodPi= reviews.stream().filter(p->p.getProduct().equalsIgnoreCase("Pizza")).count();

//        - список авторов, отсортированный по количеству лайков под их отзывами. TODO
        System.out.println("=====================================");

        System.out.println("Authors sorted by total likes:");
        Map<String, Long> authorLikes = // переводим в карту
                reviews.stream()
                        .collect(Collectors.groupingBy(Review::getAuthor, Collectors.summingLong(Review::getLikes)));

        authorLikes.entrySet().stream()// берем поток ключей и значений
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())// сортируем по значению
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + " likes"));// печать по ключу и значению
    }
}
