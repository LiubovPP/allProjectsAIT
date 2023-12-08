package hw_Lesson27;

public class CalculatorMethods {
    public double addition(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("Сумма чисел равна: " + result);
    return result;
    }

    public double subtraction(double num1, double num2) {
        double result = num1 - num2;
        System.out.println("Разница чисел равна: " + result);
        return result;
    }

    public double division(double num1, double num2) {
        double result = num1 / num2;
        System.out.println("Результат деления равен: " + result);
        return result;
    }

    public double multiply(double num1, double num2) {
        double result = num1 * num2;
        System.out.println("Результат умножения равен: " + result);
        return result;
    }
}
