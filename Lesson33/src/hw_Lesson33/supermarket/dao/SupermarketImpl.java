package hw_Lesson33.supermarket.dao;

import hw_Lesson33.supermarket.model.Product33;


public class SupermarketImpl implements Supermarket  {

    private Product33[] product33; // массив для хранения продуктов
    private int size; // текущее кол-во продуктов
    // конструктор
    public SupermarketImpl(int capacity) {
        product33 = new Product33[capacity];
    }

    @Override
    public boolean addProduct(Product33 product) {
        if (product == null || size == product33.length|| findProduct((int) product.getBarCode()) != null) {
            return false;
        }
        product33[size++] = product;
        return true;
    }

    @Override
    public Product33 removeProduct(long barCode) {
        for (int i = 0; i < size; i++) {
            if (product33[i].getBarCode() == barCode) {
                Product33 deleteComputer = product33[i];
                product33[i] = product33[--size];
                product33[size] = null;
                return deleteComputer;
            }
        }
        return null;
    }

    @Override
    public Product33 updateProduct() {
        return null;
    }

    @Override
    public Product33 findProduct(long barCode) {
        for (int i = 0; i < size; i++) {
            if(product33[i].getBarCode()==barCode){
                return product33[i];
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printProduct() {
        for (int i = 0; i < size; i++) {
            System.out.println(product33[i]);
        }
    }

    @Override
    public Product33[] findExpDateProduct(String expDate) {

        return new Product33[0];
    }

}

