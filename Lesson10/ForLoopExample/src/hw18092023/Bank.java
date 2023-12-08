package hw18092023;

import java.util.Scanner;

//За каждый месяц банк начисляет к сумме вклада 12% от суммы. Напишите программу, в которую пользователь вводит сумму
// вклада и количество месяцев. А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
public class Bank {
    public static void main(String[] args) {
        /* без Сканера
        bankbonus(1000, 0.12, 12);
    }

    public static void bankbonus(double deposit, double persent, double month) {
        for (int i = 1; i <= month; i++) {
            double monthpersent = deposit * persent;
            deposit = deposit + monthpersent;
            System.out.println("Ваш вклад через " + i + " месяцев составит: " + deposit);
        }*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        float deposit = scanner.nextFloat();
        System.out.println("Введите количество месяцев: ");
        float month = scanner.nextFloat();
        float persent = 0.12f;
        for (int i = 1; i <= month; i++) {
            float monthpersent = deposit * persent;
            deposit = deposit + monthpersent;
            System.out.println("Ваш вклад через " + i + " месяцев составит: " + deposit);
        }
    }
}
