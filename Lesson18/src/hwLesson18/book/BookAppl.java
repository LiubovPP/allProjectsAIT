package hwLesson18.book;
//В классе BookAppl в методе main создайте несколько словарей и выведите информацию о них в консоль.

import hwLesson18.book.model.Dictionary;

public class BookAppl {
    public static void main(String[] args) {
        Dictionary dictionary1 = new Dictionary("Dictionary", "Ozegov", 1999, "2-4546-4879-13", "explanatory dictionary", "russian");
        dictionary1.display();
        System.out.println();

        Dictionary dictionary2 = new Dictionary("Dictionary", "Oxford", 2010, "145-454-44-454-1", "language dictionary", "english-german");
        dictionary2.display();
        System.out.println();

        Dictionary dictionary3 = new Dictionary("Dictionary", "...some authors....", 2020, "1564-548-454769-454", "science", "english");
        dictionary3.display();
        System.out.println();

    }
}
