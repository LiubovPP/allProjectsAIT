package practice.beverage;

import practice.beverage.model.Beer;
import practice.beverage.model.Beverage;

public class BeverageApplication {
    public static void main(String[] args) {
        //создали объект
        Beverage beverage = new Beverage(); // благодаря пустому конструктору в Beverage
        beverage.displayStock();
        System.out.println();

        Beverage b1 = new Beverage("Milk","Box",10);
        b1.toBuy("Milk", "Box", 20);
        b1.displayStock();
        System.out.println();

        Beer beer =new Beer(); // благодаря пустому конструктору в Beer4
        beer.displayStock();
        System.out.println();

        Beer b2= new Beer("Augustiner", "6-pack",10, "elle");
        b2.toBuy("Augustiner", "6-pack",10, "elle");
        b2.displayStock();
        System.out.println();

    }
}
