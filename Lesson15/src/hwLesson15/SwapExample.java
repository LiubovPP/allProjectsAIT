package hwLesson15;

//Задача 4.(*) Реализовать способ обмена значениями двух переменных целого типа, не используя третьей переменной.
//В идеале написать метод swap(a, b).
public class SwapExample {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("До обмена: a = " + a + ", b = " + b);
        swapSum(a, b);
        System.out.println("После обмена: a = " + a + ", b = " + b);
    }

    // метод обмена через сумму
    public static void swapSum(int a, int b) {
        a = b + a; // 5+10=15
        b = a - b; // 15-10=5
        a = a - b; // 15-5=10
    }

    // Метод для обмена значениями двух переменных из Интернета
    public static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }
}


