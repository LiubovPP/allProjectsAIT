package practice.book.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Reader {
    private String fio;
    private String email;
    private boolean subscreiber;
    private List<Book> books;

    public Reader(String fio, String email, boolean isSubscriber, List<Book> books) {
        this.fio = fio;
        this.email = email;
        this.subscreiber = isSubscriber;
        this.books = books;
    }



    public Reader(String fio, String email, boolean isSubscriber) {
        this.fio = fio;
        this.email = email;
        this.subscreiber = isSubscriber;
        this.books = new ArrayList<>(); // инициализация
    }

    public Reader(String fio, String email) {
        this.fio = fio;
        this.email = email;
    }

    public boolean isSubscriber() {
        return subscreiber;
    }
    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSubscreiber(boolean subscreiber) {
        this.subscreiber = subscreiber;
    }

    public String getFio() {
        return fio;
    }

    public String  getEmail() {
        return email;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reader reader = (Reader) o;
        return Objects.equals(email, reader.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    @Override
    public String toString() {
        return "Reader{" +
                "fio='" + fio + '\'' +
                ", email=" + email +
                ", subscreiber=" + subscreiber +
                ", books=" + books +
                '}';
    }
}
