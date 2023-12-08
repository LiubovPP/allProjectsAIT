package hw_Lesson30.dao;

import hw_Lesson30.model.Book;

public class LibraryImpl implements Library{
    // поля
    private Book[] books;
    private int size;

    // конструктор
    public LibraryImpl(int capacity){
        books = new Book[capacity];
    }

    // методы
    @Override
    public boolean addBook(Book book) {
        if (book== null||size== books.length || findBook(book.getIsbn())!=null) {
            return false;
        }
        books[size]=book;
        size++;
        return true;
    }

    @Override
    public Book removeBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn()==isbn){
                Book victim = books[i];
                books [i]= books[size-1];
                books [size-1]= null;
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public Book findBook(long isbn) {
        for (int i = 0; i < size; i++) {
            if (books[i].getIsbn()==isbn){
                return books[i];
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printBook() {
        for (int i = 0; i < size; i++) {
            System.out.println(books[i]);
        }
    }
}