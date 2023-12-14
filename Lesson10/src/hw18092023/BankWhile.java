package hw18092023;
//За каждый месяц банк начисляет к сумме вклада 12% от суммы. Напишите программу, в которую пользователь вводит сумму
// вклада и количество месяцев. А банк вычисляет конечную сумму вклада с учетом начисления процентов за каждый месяц.
//
//Для вычисления суммы с учетом процентов используйте цикл for. Пусть сумма вклада будет представлять тип float.
// Пример работы программы:
//
//Введите сумму вклада: 100
//Введите срок вклада в месяцах: 1
//После 1 месяцев сумма вклада составит 112.000000
//Перепишите предыдущую программу, только вместо цикла for используйте цикл whil

import java.util.Scanner;

public class BankWhile {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        float deposit = scanner.nextFloat();
        System.out.println("Введите количество месяцев: ");
        float month = scanner.nextFloat();
        float persent = 0.12f;
        int i = 1;
        while (i <= month) {
            float monthpersent = deposit * persent;
            deposit = deposit + monthpersent;
            System.out.println("Ваш вклад через " + i + " месяцев составит: " + deposit);
            i++;
        }

    }


}
