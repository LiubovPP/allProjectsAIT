//вывести на экран таблицу умножения на n=3:
public class Multiply {
    public static void main(String[] args) {
        for (int a = 3, count = 1; count <= 10; count++) {
            System.out.println("Таблица умножения для числа 3:");
            int result = a * count;
            System.out.println(a + " x " + count + " = " + result);
        }
    }
}
