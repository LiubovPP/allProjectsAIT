package practice.beverage.model;

public class Beer extends Beverage {
    // поле класса, добавили вручную
    private String typeOfBeer;

    public Beer(String title, String packing, int quantity, String typeOfBeer) {
        super(title, packing, quantity); // поля из супер-класса
        this.typeOfBeer = typeOfBeer;
    }

    // пустой конструктор
    public Beer() {
    }

    public void toBuy(String title, String packing, int quantity, String typeOfBeer) {
        super.toBuy(title, packing, quantity);   // вызываем super. и вызываем toBuy
        this.typeOfBeer = typeOfBeer;
    }

    public void displayStock() {
        super.displayStock();
        System.out.println("This is " + typeOfBeer + " of beer.");
    }

    public String getTypeOfBeer() {
        return typeOfBeer;
    }

    public void setTypeOfBeer(String typeOfBeer) {
        this.typeOfBeer = typeOfBeer;
    }
}
