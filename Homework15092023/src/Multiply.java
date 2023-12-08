//Таблица умножения: Напишите программу, которая выводит таблицу умножения для числа 5 (от 1 до 10).
// Используем цикл do-while
public class Multiply {
    public static void main(String[] args) {
        int a = 5;
        int count = 1;
        System.out.println("Таблица умножения для числа 5:");
        do {
            int result = a * count;
            System.out.println(a + " x " + count + " = " + result);
            count++;
        } while (count <= 10);
    }
}
