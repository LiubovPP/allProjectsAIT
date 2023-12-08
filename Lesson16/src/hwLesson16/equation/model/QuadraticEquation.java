package hwLesson16.equation.model;
//Задача 3.(*) Создать класс QuadraticEquation в пакете equation.model. В этом классе определить поля private double a;
// private double b; private double c;. Создать конструктор public QuadraticEquation(double a, double b, double c) для
// инициализации полей. Создать геттеры и сеттеры. Создать метод public void display() для печати в консоль квадратного
// уравнения. Создать методы public double delta() и public int quantityRoots() для вычисления дискриминанта и
// количества решений уравнения соответственно.
//
//Создать клас EquationAppl в пакете equation с методом main. В методе main создать несколько экземпляров
// QuadraticEquation и вывести для каждого из них результаты работы методов display, delta, quantityRoots.

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void display() {

        System.out.println("QuadraticEquation is " + a + "* x * x + " + b + " * x " +" + "+ c + " = 0");
    }

    public double discriminant() { // Почему дельта, может я не совсем поняла, но назовем дискриминантом
        int discriminant = (int) (b * b - 4 * a * c);
        System.out.println("Discriminant of a quadratic equation is: " + discriminant);
        return discriminant;
    }

    public int quantityRoots() {
        int discriminant = (int) (b * b - 4 * a * c);
        int roots;

        if (discriminant < 0) {
            roots = 0;
            System.out.println("QuadraticEquation has " + roots + " quantity root ");
            return roots;
        } else if (discriminant == 0) {
            roots = 1;
            System.out.println("QuadraticEquation has " + roots + " quantity root ");
            return roots;
        } else {
            roots = 2;
            System.out.println("QuadraticEquation has " + roots + " quantity root ");
            return roots;
        }

    }
}

