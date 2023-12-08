package hw_Lesson31.shop.dao;

import hw_Lesson31.shop.model.Computer;

public interface Shop {
    boolean addDevice(hw_Lesson31.shop.model.Computer computer);

    Computer removeDevice(int id);

    Computer updateDevice();

    Computer findDevice(int id);

    int quantity();

    void printComputer();

    // найти компьютеры со скидкой на BlackFriday
    Computer[] findBlackFridayDiscountDevices(int minPrice, int maxPrice);//
}
