package hw_Lesson29.shape.model;
// Создайте абстрактный класс Shape с типом поля double (одно) и абстрактными методами calcArea и calcPerimeter
public abstract class Shape {
    protected double side;

    public Shape(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
                return "Shape{" +
                "side=" + side +
                '}';
    }
    public abstract double calcArea();
    public abstract double calcPerimeter();

}
