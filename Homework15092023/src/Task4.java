// Распечатать только 7 чисел от 1 до 100, которые делятся на 5 без остатка. Используем цикл while
public class Task4 {
    public static void main(String[] args) {
        int i = 1;
        int count = 0;
        while (count < 7) {
            if (i % 5 == 0) {
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}