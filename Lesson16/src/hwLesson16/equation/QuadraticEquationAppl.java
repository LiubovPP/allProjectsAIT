package hwLesson16.equation;

import hwLesson16.equation.model.QuadraticEquation;

public class QuadraticEquationAppl {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation1 = new QuadraticEquation(45, 15, 15);
        quadraticEquation1.display();
        quadraticEquation1.discriminant();
        quadraticEquation1.quantityRoots();
        System.out.println();

        QuadraticEquation quadraticEquation2 = new QuadraticEquation(78, 95, 3);
        quadraticEquation2.display();
        quadraticEquation2.discriminant();
        quadraticEquation2.quantityRoots();
        System.out.println();

        QuadraticEquation quadraticEquation3 =new QuadraticEquation(-55,1,0);
        quadraticEquation3.display();
        quadraticEquation3.discriminant();
        quadraticEquation3.quantityRoots();
    }
}
