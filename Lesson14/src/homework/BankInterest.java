package homework;

import java.util.Scanner;

//Задача 3. В сберкассу на трёхпроцентный вклад положили s рублей. Какой станет сумма вклада через n лет.
//Использовать цикл for.
public class BankInterest {
    public static void main(String[] args) {
        bankInterest();// можно было и здесь код написать, но решила, что вынесу в метод
    }

    public static void bankInterest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму вклада: ");
        double deposit = scanner.nextDouble();
        System.out.println("Введите количество лет: ");
        double years = scanner.nextDouble();

        double percent = 0.03;
        double futureDeposit = deposit;
        for (int i = 0; i < years; i++) {
            futureDeposit *= 1.03;
        }
        System.out.println("Сумма вклада через " + years + " будет равна " + futureDeposit);
    }
}
