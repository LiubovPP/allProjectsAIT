package pracrice.сalorie.dao;

import pracrice.сalorie.model.Product;

import java.util.List;

public interface Calorie {

    List<Product> readProductsFromCSV();

    void saveFood(List<Product> products);

    List<Product> loadFood();

    void addProduct(List<Product> libraryFood, List<Product> userProducts, String food, int gram);

    boolean removeProduct (String product);
}
