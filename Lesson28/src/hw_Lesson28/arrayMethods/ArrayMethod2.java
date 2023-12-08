package hw_Lesson28.arrayMethods;

//Задача 2. Создайте массив из 100 случайных целых чисел в интервале от -10 до 10. Подсчитайте, сколько в этом массиве оказалось:
//
//положительных чисел;
//отрицательных чисел;
//четных чисел;
//нулей.
//Оформите решение данной задачи методами и напишите для них тесты.
public class ArrayMethod2 {
    private int[] array = new int[100];

    public void fillArray(int[] arr, int a, int b) {
        for (int i = 0; i < arr.length; i++) {  // обходим, пробегаем все элементы массива
            arr[i] = (int) (Math.random() * (b - a + 1) + a); // в элемент массива кладем случайное целое число
        }
    }

    public int sumOfPositiveElements(int[] arr) {
        int sumOfPosEl = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {  // проверка элемента массива на положительные числа
                sumOfPosEl++;
            }
        }
        return sumOfPosEl;
    }

    public int sumOfNegativeElements(int[] arr) {
        int sumOfNegEl = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {  // проверка элемента массива на отрицательные
                sumOfNegEl++;
            }
        }
        return sumOfNegEl;
    }

    public int sumOfEvenElements(int[] arr) {
        int sumOfEvenEl = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {  // проверка элемента массива на четность
                sumOfEvenEl++;
            }
        }
        return sumOfEvenEl;
    }

    public int sumOfNullElements(int[] arr) {
        int sumOfOddEl = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {  // проверка элемента массива на нули
                sumOfOddEl++;
            }
        }
        return sumOfOddEl;
    }
}
