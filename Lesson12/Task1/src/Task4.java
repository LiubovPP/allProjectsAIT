import java.util.Scanner;

//Задача 4 Число встреч
//Пользователь вводит два числа: длину массива и число X. Программа заполняет массив случайными числами (число X может
// не оказаться в масиве). Задача — найти, сколько раз число X встречается в массиве.
public class Task4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите длину массива: ");
    int a = scanner.nextInt();
    System.out.println("Введите число X: ");
    int x = scanner.nextInt();
    int[] array = new int[a];
    int from = -15;
    int to = 15;
    System.out.println("Массив заполнен следующими случайными числами: ");
    for (int i = 0; i < array.length; i++) {
      array[i] = (int) (Math.random() * (to - from + 1) + from);
      System.out.print(array[i] + "\t");
    }
    System.out.println();
    int counter = 0;
    for (int i = 0; i < array.length; i++) {
      if (array[i] == x) {
        counter++;
      }
    }
    System.out.println("Число "+ x + " встречается "+ counter + " раз");

  }
}
