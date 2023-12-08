package hw_Lesson29.shape.model;

public class Square extends Shape{
    public Square(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        double area = side*side;
        return area;
    }

    @Override
    public double calcPerimeter() {
        double per = side+side+side+side;
        return per;
    }
}
