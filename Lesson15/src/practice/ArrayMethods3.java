package practice;

public class ArrayMethods3 {
// метод поиска заданного дубликата
    public static int searchDuplicate(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                count++;
            }
        }
        return count;
    }

    // пишем binarySearch
    public static int binarySearch(int[] arr, int number) {
        int left = 0; // индекс первого элемента
        int right = arr.length - 1; // индекс последнего элемента

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == number) {
                return mid; // сразу нашелся искомый элемент
            } else if (number < arr[mid]) {
                right = mid - 1; // идем влево, отсекаем правую сторону
            } else {
                left = mid + 1;
            }
        }
        return -left - 1; // хотим вернуть индекс =-1, если элемент не найден

    }


    // пузырьковая сортировка от меньшего к большему
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) { // правый конец будет двигаться к началу
                if (arr[j] > arr[j + 1]) { // если левый из соседей больше правого, то их меняем местами,
                    // бОльший элемент "всплывает" к правому концу массива
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    // сортировка выбором от меньшего к большему
    public static int[] sortedSort(int[] arr) {
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

    public static void fillArrayRandomInt(int[] arr, int a, int b) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (b - a + 1) + a);
        }
    }


    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void split() {
        System.out.println("-------------------------------");
    }

}


