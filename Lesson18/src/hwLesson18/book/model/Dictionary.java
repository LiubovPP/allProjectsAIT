package hwLesson18.book.model;

//Создайте класс Dictionary, который расширяет класс Book. Предложите для него набор полей и переопределите метод
//display.
public class Dictionary extends Book {
    private String typeOfBook;
    private String language;


    public Dictionary(String title, String author, int year, String ISBN, String typeOfBook, String language) {
        super(title, author, year, ISBN);
        this.typeOfBook = typeOfBook;
        this.language = language;
    }

    public void display() {
        super.display();
        System.out.println("This book is " + typeOfBook + " in " + language);
    }
}
