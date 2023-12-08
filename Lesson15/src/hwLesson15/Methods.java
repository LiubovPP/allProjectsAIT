package hwLesson15;

public class Methods {

    // Метод для обмена значениями двух переменных, просто сохраняю здесь
    public static void swap(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
    }

    public static int[] positiveNumbers(int[] arr) { // метод отбора положительных чисел из массива и его вывод в консоль
        int positive = 0;
        int count = 0;
        int[] arrayNew = new int[count];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positive = arr[i];
                count++;
                System.out.print(positive + "  ");
            }
        }
        return arrayNew;
    }

    public static int binarySearch(int[] arr, int number) {
        int left = 0;// индекс первого элемента
        int right = arr.length - 1;// индекс последнего элемента
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == number) {
                return mid; // сразу нашелся искомый элемент
            } else if (number < arr[mid]) {
                right = mid - 1;// идем влево, отсекаем правую сторону
            } else {
                left = mid + 1; //идем вправо, отсекаются элементы слева
            }
        }
        return -left - 1;

    }

    public static void bubbleSortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }


        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    public static void fillArray(int[] arr, int a, int b) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (b - a + 1) + a);
        }
    }
}


