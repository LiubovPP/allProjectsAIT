package hw_Lesson31.shop.tests;

import hw_Lesson31.shop.dao.Shop;
import hw_Lesson31.shop.dao.ShopImpl;
import hw_Lesson31.shop.model.Computer;
import hw_Lesson31.shop.model.Laptop;
import hw_Lesson31.shop.model.Smartphone;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.company.model.Employee;
import practice.company.model.Manager;

import static org.junit.jupiter.api.Assertions.*;

class ShopImplTest {
    Shop shop;
    Computer[] comp;

    @BeforeEach
    void setUp() {
        shop = new ShopImpl(4);
        comp = new Computer[4];
        comp[0] = new Computer(001, "i5", 12, 512, "HP", 1000);
        comp[1] = new Laptop(002, "i7", 16, 512, "Asus", 3, 2.1, 600);
        comp[2] = new Laptop(003, "i7", 24, 1024, "Asus", 3, 2.1, 500);
        for (int i = 0; i < comp.length; i++) {
            shop.addDevice(comp[i]);
        }
    }

    @Test
    void addDevice() {
        assertFalse(shop.addDevice(null));// if Device.equals null
        assertFalse(shop.addDevice(comp[1])); // if there's a device already
        Computer computer1 = new Laptop(004, "i5", 16, 512, "Fujutsu", 3, 2.5, 700);// created a new laptop
        assertTrue(shop.addDevice(computer1));// added the laptop
        assertEquals(4, shop.quantity());// теперь в магазине 5 устройств
        // создаем еще одно устройство
        Computer computer2 = new Smartphone(005, "Apple", 8, 124, "Apple", 24, 0.2, 546978974, 900);// создали нов Smarthone
        assertFalse(shop.addDevice(computer2));// не можем превысить capacity
        shop.printComputer();
    }

    @Test
    void removeDevice() {
        assertEquals(comp[1], shop.removeDevice(002));
        assertEquals(2, shop.quantity());
        assertNull(shop.removeDevice(002));
        assertNull(shop.findDevice(002));

    }

    @Test
    void findDevice() {
        assertEquals(comp[2], shop.findDevice(003));
        assertNull(shop.findDevice(106));
    }

    @Test
    void quality() {
        assertEquals(3, shop.quantity());
    }

    @Test
    void printComputer() {
        shop.printComputer();
    }

    @Test
    void findBlackFridayDiscountDevices() {
        Computer[] actual = shop.findBlackFridayDiscountDevices(400, 650);
        Computer[] expected = {comp[1], comp[2]};
        assertArrayEquals(expected, actual);
    }
}