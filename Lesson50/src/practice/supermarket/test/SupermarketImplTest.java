package practice.supermarket.test;

import practice.supermarket.dao.Supermarket;
import practice.supermarket.dao.SupermarketImpl;
import practice.supermarket.model.Product;

import java.time.LocalDate;
import java.util.stream.StreamSupport;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketImplTest {
    Supermarket myMarket;
    Product[] products;
    LocalDate now = LocalDate.now();

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        myMarket = new SupermarketImpl();
        products = new Product[5];
        products[0] = new Product(111111, "White Bread", "Bread", "Kolosok", 6.5, now.plusDays(5));
        products[1] = new Product(222222, "ChokoMilk", "Dairy", "MilkLand", 13, now.minusDays(3));
        products[2] = new Product(333333, "Cheese Gauda", "Dairy", "Farmer", 22.5, now.plusDays(50));
        products[3] = new Product(444444, "Cheese Chedder", "Dairy", "MilkLand", 30, now.plusDays(85));
        products[4] = new Product(555555, "Sweet Buns", "Bread", "Kolosok", 18.3, now.minusDays(25));
        for (int i = 0; i < products.length; i++) {
            myMarket.addProduct(products[i]);
        }
    }

    @org.junit.jupiter.api.Test
    void addProduct() {

        assertFalse(myMarket.addProduct(null));
        assertFalse(myMarket.addProduct(products[3]));
        Product product1 = new Product(666666, "Sweet Buns", "Bread", "Kolosok", 18.3, now.minusDays(25));
        assertTrue(myMarket.addProduct(product1));
        assertEquals(6, myMarket.skuQuantity());
        Product product2 = new Product(666666, "Sweet Buns", "Bread", "Kolosok", 18.3, now.minusDays(25));
        assertFalse(myMarket.addProduct(product2)); // с одиноковым баркодом
        Product product3 = new Product(777777, "Sweet Buns", "Bread", "Kolosok", 18.3, now.minusDays(25));
        assertTrue(myMarket.addProduct(product3));
    }

    @org.junit.jupiter.api.Test
    void removeProduct() {
        assertEquals(products[1], myMarket.removeProduct(222222));
        assertEquals(4, myMarket.skuQuantity());
        assertNull(myMarket.removeProduct(222222)); // дважды не можем удалить
        assertNull(myMarket.removeProduct(222222));

    }

    @org.junit.jupiter.api.Test
    void findByBarCode() {
        assertEquals(products[1], myMarket.findByBarCode(222222));
        assertNull(myMarket.findByBarCode(888888));
    }

    @org.junit.jupiter.api.Test
    void findByCategory() {
        Iterable<Product> actualP = myMarket.findByCategory("bread");
        Product[] expected = {products[0], products[4]};
        // Convert Iterable<Product> to an array for comparison
        // как перевести Iterable в обычный массив:
        Product[] actual = StreamSupport.stream(actualP.spliterator(), false)
                .toArray(Product[]::new);
        assertArrayEquals(expected, actual);
        //StreamSupport.stream(actualP.spliterator(), false):
        //
        //actualP.spliterator(): Этот метод используется для получения Spliterator (специального итератора) по элементам
        // объекта Iterable<Product>.
        //StreamSupport.stream(...): Этот метод создает последовательный поток данных из Spliterator.
        //.toArray(Product[]::new):
        //
        //toArray(...): Этот завершающий метод собирает элементы потока в массив.
        //Product[]::new: Это ссылка на конструктор, предоставляющая конструктор для создания массива заданного типа
        // (Product в данном случае).
        //В кратце, этот код берет объект Iterable<Product> (actualP) и преобразует его в поток данных с использованием
        // Stream API. Затем он собирает элементы потока в массив типа Product. Полученный массив Product[] (actual)
        // может использоваться для сравнения, в данном случае, с ожидаемым массивом.
        //
        //Это часто используется, когда у вас есть объект Iterable, и вам нужно сравнить его элементы с массивом. Метод
        // assertArrayEquals из JUnit ожидает массивы, поэтому преобразование необходимо для корректного тестирования.

        // или проще:
        //  // надо перенести actual в массив
        //        int l = actual.size();
        //        Product[] productsActual = new Product[l];
        //        for (int i = 0; i < l; i++) {
        //            productsActual[i] = actual.get(i);
        //        }
    }

    @org.junit.jupiter.api.Test
    void findByBrand() {
        Iterable<Product> actualP = myMarket.findByBrand("kolosok");
        Product[] expected = {products[0], products[4]};
        // Convert Iterable<Product> to an array for comparison
        // как перевести Itarable в обычный массив:
        Product[] actual = StreamSupport.stream(actualP.spliterator(), false)
                .toArray(Product[]::new);
        assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void findProductsWithExpiredDate() {
        Iterable<Product> actualP = myMarket.findProductsWithExpiredDate();
        Product[] expected = {products[1], products[4]};
        // Convert Iterable<Product> to an array for comparison
        // как перевести Itarable в обычный массив:
        Product[] actual = StreamSupport.stream(actualP.spliterator(), false)
                .toArray(Product[]::new);
        assertArrayEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void skuQuantity() {
        assertEquals(5, myMarket.skuQuantity());
    }

}