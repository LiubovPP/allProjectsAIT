//Четные числа: Напишите программу, которая выводит все
// четные числа от A до B. Используем цикл do-while
public class Task5 {
    public static void main(String[] args) {
        int a = 0;
        int b = 100;
        do {
            System.out.println("четное " + a);
            a += 2;
        } while (a <= b);
    }
}
