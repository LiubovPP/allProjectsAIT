package homework;

import java.util.Scanner;

//Задача 4. Ввести с клавиатуры 10 пар целых чисел. Сравните числа в каждой паре и напечатайте большие из них.
// Использовать цикл for.
public class CompareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // для этой задачки погуглила помощь в Интернете, зато теперь знаю,
        //что Scanner можно закрыть, хотя, закомментировав, проверила, что и так работает.
        //Нашла следующее: В данном коде закрытие Scanner является хорошей практикой, хотя оно не обязательно для
        //System.in (стандартного потока ввода). Однако в более сложных программах с другими источниками ввода,
        //закрытие Scanner может быть обязательным.

        // Создаем цикл для ввода 10 пар чисел
        for (int i = 0; i < 10; i++) {
            System.out.print("Введите первое число: ");
            int firstNumber = scanner.nextInt();

            System.out.print("Введите второе число: ");
            int secondNumber = scanner.nextInt();

            // Сравниваем числа и выводим большее из них
            if (firstNumber > secondNumber) {
                System.out.println("Большее число: " + firstNumber);
            } else if (firstNumber < secondNumber) {
                System.out.println("Большее число: " + secondNumber);
            } else {
                System.out.println("Числа равны.");
            }
        }

        // Закрываем сканнер
        scanner.close();
    }

}
