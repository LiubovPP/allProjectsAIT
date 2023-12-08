package hw_Lesson28.arrayMethods;
//Задача 1. Реализуйте в классе ArrayMethods следующие методы для массивов целых чисел:
//
//Разработайте тесты для этих методов.
public class ArrayMethods {
    private int[] array;

    public int sumArray(int[] arr) {//сумма всех элементов массива;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { // линейный поиск
            sum += arr[i];
        }
        return sum;
    }

    public int arrayElement(int[] arr, int element) {//линейный поиск элемента в массиве;
        int elementIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                elementIndex = i;
                return elementIndex;
            }
        }
        return -1;
    }
    public int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; // Возвращаем индекс найденного элемента
            }

            if (array[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Если элемент не найден
    }

}
