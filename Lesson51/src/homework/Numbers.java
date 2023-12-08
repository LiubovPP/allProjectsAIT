package homework;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Задача 2. Написать программу, которая:
//
//прочитает с клавиатуры количество вводимых чисел,
//прочитает с клавиатуры сами числа и соберёт их в множество,
//удалить из множества числа большие 10 и выведет полученные результаты на экран. Все числа, которые подаются на вход
// программы, целые.
//Task 2. Write a program that:
//
//reads the number of entered numbers from the keyboard,
//reads the numbers themselves from the keyboard and collects them into a set,
//will remove numbers greater than 10 from the set and display the results on the screen. All numbers supplied to the
// program input are integers.
public class Numbers {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the quantity of numbers: ");
        int numberOfnumbers = scanner.nextInt();
        scanner.nextLine();
        int i = 0;
        while (i < numberOfnumbers) {
            System.out.println("Input the number: ");

            Integer newNumber = scanner.nextInt();
            if (numbers.add(newNumber)) {
                System.out.println("The number is added.");
            } else {
                System.out.println("The number exists already.");
            }
            i++;
        }

        numbers.removeIf(number -> number > 10);

        System.out.println("The numbers you've printed : ");
        System.out.println(numbers);
    }
}
