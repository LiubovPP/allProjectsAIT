package hw_Lesson33.supermarket.model;

import practice.cat.Cat;

public class Product33 implements Comparable<Product33> {
    private String name;
    private long barCode;
    private double price;

    private String expDate;
    public Product33(String name, long barCode, double price, String expDate) {
        this.name = name;
        this.barCode = barCode;
        this.price = price;
        this.expDate=expDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBarCode() {
        return barCode;
    }

    public void setBarCode(long barCode) {
        this.barCode = barCode;
    }

    public double getPrice() {
        return price;
    }

    public String getExpDate() {
        return expDate;
    }

    public void setExpDate(String expDate) {
        this.expDate = expDate;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product33{" +
                "name='" + name + '\'' +
                ", barCode=" + barCode +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Product33 product33 = (Product33) object;

        return barCode == product33.barCode;
    }

    @Override
    public int hashCode() {
        return (int) (barCode ^ (barCode >>> 32));
    }


    @Override
    public int compareTo(Product33 o) //
        int res = this.getExpDate().compareTo(o.expDate);
        return res;
    }
    }

