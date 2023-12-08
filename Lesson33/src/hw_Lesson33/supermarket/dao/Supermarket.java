package hw_Lesson33.supermarket.dao;

import hw_Lesson33.supermarket.model.Product33;

public interface Supermarket {
    boolean addProduct(Product33 product33);

    Product33 removeProduct(long barCode);

    Product33 updateProduct();

    Product33 findProduct(long barCode);

    int quantity();

    void printProduct();

  // найти продукт по дате
    Product33[] findExpDateProduct (String expDate);
}
