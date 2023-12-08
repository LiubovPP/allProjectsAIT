import java.util.Scanner;

//Задача 1. Составьте программу, которая вычисляет сумму чисел от 1 до 1/n, n вводится с клавиатуры.
// Пример: n = 10 sum = 1 + 1/2 + 1/3 + ... + 1/10 Использовать цикл for.

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число n: ");
        int n = scanner.nextInt();

        /*double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (double) 1/i; // кастинг
        }*/

        double sum = 0;
        for (double i = 1; i <= n; i++) {
            sum = sum + 1/i;
        }
            System.out.println("Сумма равна: " + sum);
        }
    }