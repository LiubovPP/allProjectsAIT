package hwLesson18.book.model;

//Создайте класс Book с полями: название - title автор - author год издания - year уникальный номер - ISBN В классе
//Book реализуйте конструктор, геттеры и сеттеры на все поля и метод display, который выводит информацию о книге.
public class Book {
    private String title;
    private String author;
    private int year;
    private String isbn; // ISBN но пишем маленькими, когда объявляем

    public Book(String title, String author, int year, String ISBN) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getISBN() {
        return isbn;
    }

    public void setISBN(String ISBN) {
        this.isbn = ISBN;
    }

    public void display() {
        System.out.println("A book called " + title + " the author " + author + " published in " + year + " numbered " + isbn);
    }
}
