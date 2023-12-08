package hw_Lesson29.shape.model;
//Создать классы Circle, Triangle, Square, расширяющие класс Shape и реализующие абстрактные методы.
public class Circle extends Shape{
    protected final double  pi= 3.14;

    public Circle(double side) {
        super(side);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Circle circle = (Circle) object;

        return Double.compare(pi, circle.pi) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(pi);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public double calcArea() {
        double area = pi*side*side;// side = radius
        return area;
    }

    @Override
    public double calcPerimeter() {
        double per = 2*pi*side;
        return per;
    }

}
