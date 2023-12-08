import java.util.Scanner;

public class Task1 {
    //Задача 1 "Оценки"
    //Создайте массив из 5 элементов для хранения оценок студента. Заполните массив оценками и вычислите средний балл студента.
    //
    //используйте Scanner для заполнения массива.
    public static void main(String[] args) {

        int[] grades = new int[5];
        double sum = 0;
        ;
        for (int i = 0; i < grades.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите оценку: ");
            int grade = scanner.nextInt();
            grades[i] += grade;

        }
        double average = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
            average = sum / grades.length;

        }
        System.out.println("Среднее арифметическое оценок: " + average);

    }
}
