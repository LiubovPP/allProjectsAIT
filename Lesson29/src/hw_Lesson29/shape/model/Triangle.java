package hw_Lesson29.shape.model;

public class Triangle extends Shape{
    public Triangle(double side) {
        super(side);
    }

    @Override
    public double calcArea() {
        double area =(side*side *Math.sqrt(3.0))/4.0;// стороны треугольника равнозначны
        return area;
    }

    @Override
    public double calcPerimeter() {
         double per= 3*side;
         return per;
    }

}
