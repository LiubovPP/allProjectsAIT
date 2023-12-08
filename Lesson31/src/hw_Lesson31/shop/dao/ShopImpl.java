package hw_Lesson31.shop.dao;

import hw_Lesson31.shop.model.Computer;

public class ShopImpl implements Shop {
    private Computer[] devices; // массив для хранения устройств в магазине
    private int size; // текущее кол-во девайсов

    public ShopImpl(int capacity) {
        devices = new Computer[capacity];
    }

    @Override
    public boolean addDevice(Computer computer) {
        if (computer == null || size == devices.length || findDevice(computer.getId()) != null) {
            return false;
        }
        devices[size++] = computer;
        return true;
    }

    @Override
    public Computer removeDevice(int id) {
        for (int i = 0; i < size; i++) {
            if (devices[i].getId() == id) {
                Computer deleteComputer = devices[i];
                devices[i] = devices[--size];
                devices[size] = null;
                return deleteComputer;
            }
        }
        return null;
    }

    @Override
    public Computer updateDevice() {
        return null;
    }// посмотреть, как реализовано

    @Override
    public Computer findDevice(int id) {
        for (int i = 0; i < size; i++) {
            if (devices[i].getId() == id) {
                return devices[i];
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printComputer() {
        for (int i = 0; i < size; i++) {
            System.out.println(devices[i]);
        }

    }

    @Override
    public Computer[] findBlackFridayDiscountDevices(int minPrice, int maxPrice) {// для этого заведем поле цена в Computer
        int count = 0; // считаем, сколько будет элементов, удовлетворяющих условию
        for (int i = 0; i < size; i++) {
            if (devices[i].getPrice() < maxPrice && devices[i].getPrice() > minPrice) {
                count++;
            }
        }
            Computer[] res = new Computer[count];
            for (int i=0, j = 0; j < res.length ; i++) {

                   if (devices[i].getPrice()<maxPrice && devices[i].getPrice()> minPrice) {
                    res[j++] = devices[i]; // постфиксная операция
                }

            }
            return res;
        }

    }




