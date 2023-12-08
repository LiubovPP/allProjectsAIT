package consultation.supermarket.dao;

import consultation.supermarket.model.Product;

public interface Supermarket {
    boolean addProduct(Product product);
    Product removeProduct(Long barCode);
    Product findByBarCode(Long barCode);
    Iterable<Product> findByCategory(String category);
    Iterable<Product> findByBrand(String brand);
    Iterable<Product> findProductWithExpDate();
    int skuQuantity();

}
