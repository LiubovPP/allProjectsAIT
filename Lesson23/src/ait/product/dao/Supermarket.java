package ait.product.dao;

import ait.product.model.Product;

public class Supermarket {
    // поля классов
    private Product[] products;// из поля класса сделали массив типа Product
    private int quantity; // текущее количество продуктов ("на складе")

    // конструктор класса
    public Supermarket(int capacity) {//длина массива, в котором хранятся продукты
        products = new Product[capacity]; // создаем новый объект
    }

    public boolean addProduct(Product product) {
        if (product == null || quantity == products.length || findProduct(product.getBarcode()) != null) {
            return false;
        }
        products[quantity] = product;// добавляем в конец массива
        quantity++; // у
        return true;
    }

    public Product findProduct(long barcode) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getBarcode() == barcode) {
                return products[i];
            }
        }
        return null;
    }

    public Product updateProduct(long barСode, double price) {
        // TODO update product price
        // найти продукт в массиве по его баркоду и обновить ему цену
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getBarcode() == barСode) {
                products[i].setPrice(price);
                return products[i];
            }
        }
        return null;
    }

    public boolean removeProduct(long barСode) {
        // TODO remove product

        // найти продукт в массиве по его баркоду и удалить элемент массива:
        for (int i = 0; i < products.length; i++) {

            if (products [i]!= null && products[i].getBarcode() == barСode) {
                products[i] = null;
                for (int j = i; j < products.length - 1; j++) {// пусть удаляемый продукт стоит на i-м индексе, тогда все
                    // элементы массива надо сдвинуть с места i + 1 на 1 позицию влево,

                    products[j] = products[j + 1];
                }
                //последний элемент присвоить null, длину массива уменьшить на 1.
                products[quantity - 1] = null;
                quantity--;
                return true;
            }

        }

        return false;
    }
    // public boolean removeProduct(long barCode) {  // Вариант удаления через: последний элемент поставить на место удаленного
    //        // TODO remove product
    //        // найти продукт в массиве по его баркоду и удалить элемент массива:
    //        // пусть удаляемый продукт стоит на i-м индексе, тогда можно поставить на его место последний элемент массива,
    //        // затем последний элемент присвоить null, длину массива уменьшить на 1.
    //        for (int i = 0; i < products.length; i++) {
    //            if (products[i] != null && products[i].getBarcode() == barCode) {
    //                products[i] = products[quantity - 1]; // последний элемент массива ставим на место удаляемого
    //                products[quantity - 1] = null; // обнуляем последний элемент
    //                quantity--; //
    //                return true;
    //            }
    //        }
    //        return false;
    //    }

    public void printAllProducts() {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println(products[i]);
            }else {
                System.out.println("Empty slot");
            }
        }
    }

    public int getQuantity() {
        return quantity;
    }

}