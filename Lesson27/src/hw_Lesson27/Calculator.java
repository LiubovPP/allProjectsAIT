package hw_Lesson27;

import java.util.Scanner;


public class Calculator {
    // Калькулятор: Напишите программу, которая принимает два числа и операцию, а затем выполняет эту операцию.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        double num1 = scanner.nextInt();
        System.out.println("Введите второе число: ");
        double num2 = scanner.nextInt();
        System.out.println("Введите арифметическое действие + , -, / или *");
        String operation = scanner.next();
        if (operation == "+") {
            addition(num1, num2);
        } else if (operation == "-") {
            subtraction(num1, num2);
        } else if (operation == "/") {
            division(num1, num2);
        } else if (operation == "*") {
            multiply(num1, num2);
        }else {
            System.out.println("Wrong operation, try again");
        }

    }

    public static void addition(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("Сумма чисел равна: " + result);
    }

    public static void subtraction(double num1, double num2) {
        double result = num1 - num2;
        System.out.println("Разница чисел равна: " + result);
    }

    public static void division(double num1, double num2) {
        double result = num1 / num2;
        System.out.println("Результат деления равен: " + result);
    }

    public static void multiply(double num1, double num2) {
        double result = num1 * num2;
        System.out.println("Результат умножения равен: " + result);
    }
}

