package consultation;

import java.util.Objects;

public class Product {
    private int id;
    private double price;
    protected String brand;

    public Product(int id, double price, String name) {
        this.id = id;
        this.price = price;
        this.brand = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

//    @Override  // написано самостоятельно с Андреем
//    public boolean equals(Object obj) {
//        if (obj == null) {
//            return false;
//        }
//        if (this == obj) {
//            return true;
//        }
//        if (obj instanceof Product) {
//            Product product = (Product) obj;
//            return product.id == this.id;
//        }
//        return false;
//    }

    @Override // сгенерировано генератором
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Product product = (Product) object;
        return id == product.id && Double.compare(price, product.price) == 0 && Objects.equals(brand, product.brand);
    }

    @Override // сгенерировано генератором
    public int hashCode() {
        return Objects.hash(id, price, brand);
    }

    public void cost() {
        System.out.println("Product " + this.brand + " costs " + this.price + " euro.");
    }
}
