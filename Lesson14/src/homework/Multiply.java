package homework;

//Задача 5. Найти произведение двузначных нечетных чисел кратных 17.

public class Multiply {
    public static void main(String[] args) {
        int multiply = 1;

        // Перебираем двузначные нечетные числа, кратные 17
        for (int i = 17; i < 100; i += 17) {
            if (i % 2 != 0) { // Проверяем, что число нечетное
                multiply *= i;
            }
        }
        
        System.out.println("Произведение двузначных нечетных чисел, кратных 17: " + multiply);
    }
}
