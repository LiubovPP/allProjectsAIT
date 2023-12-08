package hwLesson17.cube.model;

// Задача 1. Создать класс Cube, описывающий куб cо стороной a. Реализовать в нем методы определения периметра p (сумма
// длин всех ребер), площади s (сумма площадей всех граней) и объема v. Создать приложение CubeAppl, в котором создать
// несколько экземпляров класса Cube. Для каждого экземпляра вызвать методы класса Cube и рассчитать p, s и v.
public class Cube {
    private double a;

    public Cube(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void perimeter() {
        double sumP = 12 * a;
        System.out.println("Perimeter of the cube is "+sumP);
    }

    public void square() {
        double sumS = 6 * a * a;
        System.out.println("Sum of all sides is "+ sumS);
    }

    public void volume() {
        double sumV = a * a * a;
        System.out.println("The volume of the cube is "+sumV);
    }

    public void display() {
        System.out.println("A cube with a side: " + a);

    }
}
