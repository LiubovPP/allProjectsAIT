package consultation;

import java.util.Objects;

public class Pen extends Product {
    private String color;

    public Pen(int id, double price, String name, String color) {
        super(id, price, name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void cost (){
        System.out.println("The Pen " + this.brand + " costs " + this.getPrice() + " euro.");
    }
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Pen pen = (Pen) object;
        return Objects.equals(color, pen.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), color);
    }
}
