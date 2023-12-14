import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

//Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все
// числа от 1 до введенного пользователем числа.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число");
        int counter = scanner.nextInt();
        int sum = 0;
        for (int n = 1; n <= counter; n++) {
            sum += n;
        }
        System.out.println("Сумма чисел от 1 до равна: " + sum);
    }
}
