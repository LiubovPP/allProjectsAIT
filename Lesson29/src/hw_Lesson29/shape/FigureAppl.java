package hw_Lesson29.shape;

import hw_Lesson29.shape.model.Circle;
import hw_Lesson29.shape.model.Shape;
import hw_Lesson29.shape.model.Square;
import hw_Lesson29.shape.model.Triangle;

public class FigureAppl {// Напишите класс FigureAppl с методом main. В методе создайте массив фигур. Добавьте в массив

    //два круга, один треугольник и один квадрат. Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.
    public static void main(String[] args) {
        Shape[] shape = new Shape[4];
        shape[0] = new Circle(5);
        shape[1] = new Circle(15);
        shape[2] = new Triangle(10);
        shape[3] = new Square(60.35);
        System.out.println("The total area of all figures is " + allFiguresArea(shape));
        System.out.println("The total perimeter of all figures is " + allFiguresPerimeter(shape));
        System.out.println("The total sum of all circles is " + allCirclesArea(shape));
    }

    public static double allFiguresArea(Shape[] shape) {
        double res = 0;
        for (int i = 0; i < shape.length; i++) {
            res += shape[i].calcArea();
        }
        return res;
    }

    public static double allFiguresPerimeter(Shape[] shape) {
        double res = 0;
        for (int i = 0; i < shape.length; i++) {
            res += shape[i].calcPerimeter();
        }
        return res;
    }

    //Задача 3. Рассчитайте общую площадь кругов из задачи 2.
    public static double allCirclesArea(Shape[] shape) {
        double sum = 0;
        for (int i = 0; i < shape.length; i++) {
            if (shape[i] instanceof Circle) {
                sum += shape[i].calcArea();
            }
        }
        return sum;
    }
}