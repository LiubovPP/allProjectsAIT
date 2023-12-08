package practice.book;

import practice.book.model.Book;
import practice.book.model.Email;
import practice.book.model.Library;
import practice.book.model.Reader;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class LibAppl {
    public static void main(String[] args) {
        Library library = new Library();


        System.out.println("-----------------------------Activity-------------------------------");
        library.getReaders().forEach(System.out::println);

        System.out.println("------------------------Unsorted books-----------------------------------------");
        library.getBooks().forEach(System.out::println);
        System.out.println("------------------Sorted books by Year------------------------------------");
        List<Book> listOfBooksByIssueYear = library.getBooks().stream()
                .sorted(Comparator.comparing(Book::getIssueYear)).toList();
        listOfBooksByIssueYear.forEach(System.out::println);
        System.out.println("------------------Sorted books by Author------------------------------------");
        List<Book> listOfBooksByAuthor = library.getBooks().stream()
                .sorted(Comparator.comparing(Book::getAuthor)).toList();
        listOfBooksByAuthor.forEach(System.out::println);

        System.out.println("------------------Mailing list------------------------------------");
        ArrayList<Email> emailArraysList = new ArrayList<>();
        for (Reader reader: library.getReaders()) {
            emailArraysList.add(new Email(reader.getEmail()));
        }
        for (Email email: emailArraysList) {
            System.out.println(email);
        }
        System.out.println("------------------Mailing list StreamAPI------------------------------------");
        List<Email> addresses = library.getReaders().stream()
                .map(Reader::getEmail).map(Email::new).toList();
        addresses.forEach(System.out::println);

        System.out.println("------------------Mailing list subscribed User------------------------------");
                List<Email> addressesSubscribed = new ArrayList<>();
        for (Reader reader : library.getReaders()){
            if (reader.getBooks().size() >= 1 && reader.isSubscriber())
                addressesSubscribed.add(new Email(reader.getEmail()));
        }
        addressesSubscribed.forEach(System.out::println);
        System.out.println("------------------Mailing list subscribed User Stream ------------------------------");
        List<Email> addressesSubscribedStr = library.getReaders().stream()
                .filter(Reader::isSubscriber).filter(reader -> reader.getBooks().size() >= 1)
                .map(Reader::getEmail)
                .map(Email::new).toList();
        addressesSubscribedStr.forEach(System.out::println);
        System.out.println("---------List of Books---------------");
        Set<Book> rentedBooks = new HashSet<>();
        for (Reader reader : library.getReaders()) {
            rentedBooks.addAll(reader.getBooks());
        }
        rentedBooks.forEach(System.out::println);
        System.out.println("---------List of Books Stream---------------");
        List<Book> rentedBooksStr = library.getReaders().stream()
                .flatMap(reader -> reader.getBooks().stream()).distinct()
                .toList();
        rentedBooksStr.forEach(System.out::println);

  //      System.out.println("---------List of rented Books ---------------");
//        int max = 0;
//        for (Reader reader: library.getReaders()             ) {
//            if (reader.getBooks().size()> max) {
//                max = reader.getBooks().size();
//            }
//        }
//        System.out.println(max);

        System.out.println("---------List of rented Books Stream---------------");
        Integer res = library.getReaders().stream()
                .map(reader1 -> reader1.getBooks().size())
                .reduce(0,(max, size) -> size > max ? size : max);
        System.out.println(res);
        // Соберем всех пользователей, которые взяли более 2-х книг в группу "TO_MUCH", остальных
        // в группу с ключем "OK"
        System.out.println("---------List of rented Books Stream---------------");
        Map<String, List<Email>> result = new HashMap<>();
        for (Reader reader : library.getReaders()) {
            if (reader.isSubscriber()) {
                if (reader.getBooks().size() > 2) {
                    if (!result.containsKey("TOO_MUCH")) { // по этому ключу еще нет значения
                        result.put("TOO_MUCH", new ArrayList<>());
                    }
                    result.get("TOO_MUCH").add(new Email(reader.getEmail()));
                } else {
                    if (!result.containsKey("OK")) { // по этому ключу еще нет значения
                        result.put("OK", new ArrayList<>());
                    }
                    result.get("OK").add(new Email(reader.getEmail()));
                }
            }
        }
        // Print keys and values - проход по всем ключам и их значениям
        for (String key : result.keySet()) {
            System.out.println("key: " + key + " value: " + result.get(key));
        }
        System.out.println("-------------------------------------");
        result.entrySet().stream().forEach(System.out::println);

        System.out.println("-------------------List of rented Books > 2 Stream ------------------");
        System.out.println("=====================================================");
        Map<String, List<Email>> map = library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .collect(Collectors.groupingBy(r -> r.getBooks().size() > 2 ? "TOO_MUCH" : "OK",
                        Collectors.mapping(r -> new Email(r.getEmail()), Collectors.toList())));
        System.out.println(map.entrySet());
        //
        //Map<Integer, Reader> mapReader = library.getReaders().stream()
        //                .collect(Collectors.toMap(
        //                        reader -> reader.getBooks().size(),
        //                        reader -> reader
        //                ));


        } // end of Main


    }// end of class

