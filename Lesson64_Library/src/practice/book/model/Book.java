package practice.book.model;

import java.util.Objects;

//Практика - приложение Library.
//
//        Создать классы:
//
//        Book: author, name, issueYear
//        Email: email
//        Reader: fio, email, subscriber, List books
//        Library: List books, List readers
//        LibraryAppl
//        Создать и распечатать:
//
//        Список деятельности библиотеки - читатели и выданные им книги
//        Список книг unsorted
//        Список книг sorted by ...
//        Список читатель и email
//        Список email для рассылки общий
//        Список email только подписчики
//        Список выданных книг
//        Метод, выдана ли книга?
//        Какое максимальное выданное число книг читателю?
//        Список email для рассылки по группам читателей:
//        кто взял более 2-х книг
//        остальные
//        Построить отчет (карту) кол-во взятых книг - читатели
public class Book implements Comparable <Book>{
    private String author;
    private String name;
    private Integer issueYear;

    public Book(String author, String name, Integer issueYear) {
        this.author = author;
        this.name = name;
        this.issueYear = issueYear;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public Integer getIssueYear() {
        return issueYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) && Objects.equals(name, book.name) && Objects.equals(issueYear, book.issueYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name, issueYear);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", issueYear=" + issueYear +
                '}';
    }

    @Override
    public int compareTo(Book o) {
        return this.author.compareTo(o.author);
    }
}
