package homework;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Задача 1. Написать программу, которая:
//
//прочитает с клавиатуры количество вводимых названий земель в Германии,
//прочитает с клавиатуры названия земель и соберёт их в множество,
//выведет полученные результаты на экран.
//Task 1. Write a program that:
//
//reads from the keyboard the number of entered names of lands in Germany,
//reads the names of lands from the keyboard and collects them into a set,
//displays the results on the screen.


public class GermanyStates {
    public static void main(String[] args) {
        Set<String> germanState = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the quantity of german states: ");
        int numberOfLands = scanner.nextInt();
        scanner.nextLine();
        int i = 0;
        while (i < numberOfLands) {
            System.out.println("Input the name of a german state: ");

            String newState = scanner.nextLine();
            if (germanState.add(newState)) {
                System.out.println("The state is added.");
            } else {
                System.out.println("The state already exists.");
            }
            i++;
        }

        System.out.println("German states: ");
        System.out.println(germanState);

    }
}

