package ait.product;

import ait.product.dao.Supermarket;
import ait.product.model.Food;
import ait.product.model.Product;

public class SupermarketAppl {
    public static void main(String[] args) {
        Supermarket kiosk = new Supermarket(4);// новый супермаркет на 4 продукта с помощью констуктора
        kiosk.addProduct(new Product(1000, "Gift card", 20));
        System.out.println(kiosk.getQuantity());
        kiosk.addProduct(new Food(2000, "Sausages", 5, "20.10.2023", false));
        kiosk.addProduct(new Food(3000, "Goat cheese", 13, "31.12.2023", true));
        System.out.println(kiosk.getQuantity());
        kiosk.addProduct(null);
        boolean check = kiosk.addProduct(new Food(4000, "Pork fat", 3, "15.11.2023", true));
        System.out.println(check);
        check = kiosk.addProduct(new Product(5000, "Book", 2));
        System.out.println(check);
        kiosk.printAllProducts();
        Product product = kiosk.findProduct(2000);
        System.out.println(product);
        System.out.println("---------------------------------");
        // test updateProduct
        kiosk.updateProduct(2000, 20.50);
        System.out.println(product);
        System.out.println();
        // test removeProduct
        kiosk.removeProduct(3000);
        kiosk.printAllProducts();
    }
}
