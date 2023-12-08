package hwLesson19.product.model;

//Создать класс Product, с полями
//
//private String name; private long barCode; private double price;
public class Product {
    private String name;
    private long barCode;
    private double price;

    public Product(String name, long barCode, double price) {
        this.name = name;
        this.barCode = barCode;
        this.price = price;
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

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", barCode=" + barCode +
                ", price=" + price +
                '}';
    }
}
