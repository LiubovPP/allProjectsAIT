package homework.currency;

import java.util.Scanner;
//// Задача 3. Создайте enum с кодами валют и их текущими курсами к евро. Убедитесь, что в списке нет дублирующихся кодов
//// валют. Выведите список валют и их курсов на экран. Реализуйте возможность для пользователя выбрать желаемую валюту,
//// ввести ее количество и узнать, сколько он получит при обмене на евро.

public class CurrencyAppl {
    public static void main(String[] args) {
        System.out.println("Welcome to Currency menu!");
        // предложить меню для выбора
        CurrencyEnum[] menu = CurrencyEnum.values();
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + " - " + menu[i].getCurrencyCode());
        }

        while (true) {
            System.out.println("Input your choice: "); // приглашение пользователю
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt(); // приняли ввод с клавиатуры
            double amount = 0;  //кол-во валюты

            switch (choice) {
                case 1: {
                    System.out.println("Your choice is: " + menu[choice-1].getCurrency());

                    break;
                }
                case 2: {
                    System.out.println("Your choice is: " + CurrencyEnum.TWO.getCurrency());
                    System.out.println("How many dollars do you want to change: ");
                    amount = scanner.nextDouble();
                    double euroAmount = amount / CurrencyEnum.TWO.getCurrencyCode();
                    System.out.println("In euros : "+ euroAmount);
                    break;
                }
                case 3: {
                    System.out.println("Your choice is: " + menu[choice-1].getCurrency());
                    System.out.println("How many rubles do you want to change: ");
                    amount = scanner.nextDouble();
                    double euroAmount = amount / CurrencyEnum.THREE.getCurrencyCode();
                    System.out.println("In euros : "+ euroAmount);
                    break;
                }
                case 4: {
                    System.out.println("Your choice is: " + menu[choice - 1].getCurrency());
                    System.out.println("How many pounds do you want to change: ");
                    amount = scanner.nextDouble();
                    double euroAmount = amount / CurrencyEnum.FOUR.getCurrencyCode();
                    System.out.println("In euros : "+ euroAmount);
                    break;
                }
                default: {
                    System.out.println("Wrong choice.");
                }
            }
        }
    }
}




