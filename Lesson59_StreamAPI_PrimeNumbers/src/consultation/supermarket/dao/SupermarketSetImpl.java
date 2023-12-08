package consultation.supermarket.dao;

import consultation.supermarket.model.Product;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SupermarketSetImpl implements Supermarket{
    // поля до реализации методов
    Set<Product> productSet;
    int size;
    int capacity;
    // конструктор до реализации методов

    public SupermarketSetImpl() {
        productSet = new HashSet<Product>();
                this.capacity = capacity;
    }
    public SupermarketSetImpl (List<Product> productList) {
        this();
        for (Product p:productList
             ) {
            addProduct(p);

        }
    }
    @Override
    public boolean addProduct(Product product) {
        if(product == null ){
            return false;
        }
        return productSet.add(product);

    }

    @Override
    public Product removeProduct(Long barCode) {
        Product removedProduct = findByBarCode(barCode);
        productSet.remove(removedProduct);
        return removedProduct;
    }

    @Override
    public Product findByBarCode(Long barCode) {
        return productSet.stream().filter(product -> product.getBarCode()==barCode).findFirst().orElse(null);
    }

    @Override
    public Iterable<Product> findByCategory(String category) {
        return productSet.stream().filter(product -> product.getCategory().equals(category)).toList();
    }

    @Override
    public Iterable<Product> findByBrand(String brand) {
        return productSet.stream().filter(product -> product.getBrand().equals(brand)).toList();
    }

    @Override
    public Iterable<Product> findProductWithExpDate() {
        LocalDate currentDate = LocalDate.now();
        return productSet.stream().filter(product -> product.getExpDate().isAfter(currentDate)).toList();
    }

    @Override
    public int skuQuantity() {
        return productSet.size();
    }
}
