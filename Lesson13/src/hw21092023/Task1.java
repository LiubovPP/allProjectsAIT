package hw21092023;

//Задача 1:
//Условие: Напишите программу на Java, которая использует бинарный поиск для нахождения индекса первого вхождения числа
// в отсортированном массиве с повторяющимися элементами.
////Пример:
////Вход: Отсортированный массив [1, 3, 3, 3, 7, 9, 11, 13, 15, 17, 17, 19] и число 3. Выход: Индекс первого
// вхождения числа 3 в массиве.
public class Task1 {
    public static void main(String[] args) {
        int[] array = {1, 3, 3, 3, 7, 9, 11, 13, 15, 17, 17, 19};
        System.out.println("Дан массив: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(+array[i] + "\t");
        }
        System.out.println();
        findIndex(array);
         }

    public static void findIndex(int[] arr) {
        int index = 0;
        int number = 3;
        for (int j = 0; j < arr.length; j++) {
            if (number == arr[j]) {
                index = j;
                System.out.println("Индекс первой 3 равен: " + index);
                break;
            }

        }
    }


}

