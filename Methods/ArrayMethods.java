
public class ArrayMethods {
    // метод для печати массива в консоли
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // ищем максимальный элемент массива целые числа
    public static int maxArray(int[] arr) {
        int max = arr[0]; // первое приближение для max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // ищем индекс максимального элемента
    public static int maxArrayIndex(int[] arr) {
        int max = arr[0]; // первое приближение для max
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // текущий пузырьковый метод
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) { // правый край будет двигаться к началу
                if (arr[j] > arr[j + 1]) { //если левый из соседей больше правого, то меняем местами
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }


    //  Сортировка выбором от меньшего к большему
    public static int[] sortArray(int[] arr) {
        int min = arr[0];
        int indexMin = 0;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            indexMin = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    indexMin = j;
                }
            }
            // переставляем минимальный элемент в начало
            int tmp = arr[i];
            arr[i] = arr[indexMin];
            arr[indexMin] = tmp;
        }
        return arr;
    }

    public static int[] sortArrayTrain(int[] arr) {  // это я тренировалась
        int min = arr[0];
        int indexMin = 0;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            indexMin = i;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    indexMin = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[indexMin];
            arr[indexMin] = tmp;
        }
        return arr;
    }

    // метод печатает разделитель
    public static void split() {
        System.out.println("---------------------------------------");
    }

    // reverse array
    public static void reverseArrray(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length/2 ; i++) {
            temp = arr[i]; // берем левый элемент во временную переменную
            arr[i] = arr[arr.length - 1 - i]; // переносим правый элемент на место левого
            arr[arr.length - 1 - i] = temp; // место правого ставим тот, что во временной переменной
        }
    }
    // ...
    public static int multOfElEvenIndex(int[] arr){
        int mult = 1;
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0){ // проверяем индекс на четность
                mult *= arr[i];
            }
        }
        return mult;
    }
    // ...
    public static int sumOfOddElements(int[] arr){
        int sumOfOddEl = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){  // проверка элемента массива на четность
                sumOfOddEl += arr[i];
            }
        }
        return sumOfOddEl;
    }

    // filling array
    public static void fillArray(int[] arr, int a, int b) {
        for (int i = 0; i < arr.length; i++) {  // обходим, пробегаем все элементы массива
            arr[i] = (int) (Math.random() * (b - a + 1) + a); // в элемент массива кладем случайное целое число
        }
    }
}

