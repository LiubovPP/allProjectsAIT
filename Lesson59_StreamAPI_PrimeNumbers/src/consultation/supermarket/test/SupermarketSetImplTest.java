package consultation.supermarket.test;

import consultation.supermarket.dao.Supermarket;
import consultation.supermarket.dao.SupermarketSetImpl;
import consultation.supermarket.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketImplTest {
    Supermarket rewe;
    LocalDate now;
    @BeforeEach
    void setUp() {
        now= LocalDate.now();
        rewe=new SupermarketSetImpl();
        rewe.addProduct(new Product(10000000,"N1","C1","B1",1.10,now.minusDays(1)));
        rewe.addProduct(new Product(20000000,"N2","C1","B2",1.30,now.plusDays(0)));
        rewe.addProduct(new Product(30000000,"N3","C2","B2",5.70,now.plusDays(14)));
        rewe.addProduct(new Product(40000000,"N4","C3","B3",13.30,now.plusDays(7)));


        //rewe.(s-> System.out.println(s));
        System.out.println();

    }

    @Test
    void addProduct() {
        rewe.addProduct(new Product(0,"","","",0,null));
        assertFalse(rewe.addProduct(null));
        assertFalse(rewe.addProduct(new Product(10000000,"N14","C11","B12",2.10,now.minusDays(2))));
        //  rewe.forEach(s-> System.out.println(s));
        System.out.println();

    }

    @Test
    void removeProduct() {
        assertEquals(new Product(40000000,"N4","C3","B3",13.30,now.plusDays(7)),rewe.removeProduct(40000000L));
        assertNull(rewe.removeProduct(40000000L));
        assertNull(rewe.removeProduct(0L));
    }

    @Test
    void findByBarCode() {
        Product product = new Product(10000000, "N1", "C1", "B1", 1.10, now.minusDays(1));
        assertEquals(product, rewe.findByBarCode(10000000L));
        assertNull(rewe.findByBarCode(0L));
        assertNull(rewe.findByBarCode(70000000L));
    }

    @Test
    void findByCategory() {
        List<Product>exp=new ArrayList<>();
        exp.add(new Product(10000000,"N1","C1","B1",1.10,now.minusDays(1)));
        exp.add(new Product(20000000,"N2","C1","B2",1.30,now.plusDays(0)));
        Iterable<Product>act=rewe.findByCategory("C1");
        act.forEach(s-> System.out.println(s));
        assertEquals(exp,act);
    }

    @Test
    void findByBrand() {
        List<Product>exp=new ArrayList<>();
        exp.add(new Product(20000000,"N2","C1","B2",1.30,now.plusDays(0)));
        exp.add(new Product(30000000,"N3","C2","B2",5.70,now.plusDays(14)));
        Iterable<Product>act=rewe.findByBrand("B2");
        act.forEach(s-> System.out.println(s));
        assertEquals(exp,act);
    }

    @Test
    void findProductWithExpDate() {
        List<Product>exp=new ArrayList<>();
        exp.add(new Product(10000000,"N1","C1","B1",1.10,now.minusDays(1)));
        Iterable<Product>act=rewe.findProductWithExpDate();
        act.forEach(s-> System.out.println(s));
        assertEquals(exp,act);
    }

    @Test
    void skuQuantity() {
        assertEquals(4,rewe.skuQuantity());
    }

    @Test
    void iterator() {
    }
}