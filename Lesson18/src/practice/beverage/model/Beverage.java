package practice.beverage.model;

//создаем родительский класс Beverage и дочерний класс Beer. Закупаем напитки, смотрим остатки на складе.
public class Beverage {
    // fields
    private String title; // название, наименование
    private String packing; // вид упаковки
    private int quantity; // количество упаковки

    // конструктор
    public Beverage(String title, String packing, int quantity) {
        this.title = title;
        this.packing = packing;
        this.quantity = quantity;
    }

    // конструктор без полей, чтоб создать напиток
    public Beverage() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPacking() {
        return packing;
    }

    public void setPacking(String packing) {
        this.packing = packing;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // метод для покупки
    public void toBuy(String title, String packing, int quantity) {
        // this.title = title; // здесь мы связали текущий объект с методом (поля с объявленными в скобках переменных)
        // this.packing = packing;
        // this.quantity = quantity;
        System.out.println("Go to market and buy: " + title + " " + packing + " " + quantity + ".");
    }

    // метод проверки остатков на складе
    public void displayStock() {
        System.out.println("We have: " + title + " " + packing + " " + quantity + ".");
    }
}
