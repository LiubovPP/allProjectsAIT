import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int[] source = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19}; // размер 10

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите число для поиска");
            int target = scanner.nextInt(); // искомое значение

            // значение искомого элементиа по умолчанию
            int searchElementIndex = -1; // Если элемент не найдет, вернется индекс со значением "-1"
            int left = 0; // индекс первого элемента в массиве
            int right = source.length - 1; // индекс последнего элемента в массиве

            // int mid = (right + left) / 2; // (0 + 9) / 2 = 4
            while (left <= right) {
                int mid = left + (right - left) / 2; // // Вычисляем середину
                int currentValue = source[mid]; // текущее значение
                if (currentValue == target) {
                    searchElementIndex = mid;
                } else if (currentValue < target) { // 9 < 1 - fasle
                    left = mid + 1; // Сужаем область поиска справа
                } else if (currentValue > target) { // 9 > 1 - true
                    right = mid - 1; // Сужаем область поиска слева
                }
            }

            // пример для числа 1 и массива [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]
            // 1 итерация - left = 0, right 9, mid = 4, currentValue = 9 диапазон поиска 1, 3, 5, 7, 9, 11, 13, 15, 17, 19
            // currentValue == target (9 == 1) - false
            // currentValue < target (9 < 1) - false
            // currentValue < target (9 > 1) - true
            // смещаемся влево, обрезаем правую границу right = mid - 1. (4 - 1 =  3)
            // новый диапазон поиска 1, 3, 5, 7  |||  эту часть обрезали сместив правую границу  9, 11, 13, 15, 17, 19

            // 2 итерация - left = 0, right 3, mid = 2, currentValue = 3 диапазон поиска 1, 3, 5, 7
            // currentValue == target (9 == 1) - false
            // currentValue < target (9 < 1) - false
            // currentValue < target (9 > 1) - true
            // смещаемся влево, обрезаем правую границу right = mid - 1. (2 - 1 =  1)
            // новый диапазон поиска 1  |||  эту часть обрезали сместив правую границу 3, 5, 7, 9, 11, 13, 15, 17, 19


            System.out.println("Индекс искомого элемента " + target + " " + searchElementIndex);
        }

    }
}