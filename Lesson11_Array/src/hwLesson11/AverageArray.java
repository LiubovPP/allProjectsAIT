package hwLesson11;

public class AverageArray {
    //Задача 3 *
    //Среднее арифметическое элементов массива
    //
    //Создайте 2 массива из 5 случайных целых чисел из отрезка от 0 до 5 каждый
    //Выведите массивы на экран в двух отдельных строках
    //Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов это
    // значение оказалось больше (либо сообщите, что их средние арифметические равны)
    public static void main(String[] args) {
        int[] array1 = fillArray(5, 5, 0);

        System.out.println("\n");

        double average1 = 0;
        int lenth1 = array1.length;

        for (int i = 0; i < array1.length; i++) {
            average1 += array1[i];
        }
        double res1 = average1 / lenth1;
        System.out.println("Среднее арифметического первого массива равен: " + res1);
        System.out.println();

        int[] array2 = fillArray(5, 5, 0);
        System.out.println("\n");

        double average2 = 0;
        int lenth2 = array2.length;

        for (int j = 0; j < array2.length; j++) {
            average2 += array2[j];
        }
        double res2 = average2 / lenth2;
        System.out.println("Среднее арифметического второго массива равен: " + res2);
        // Не пойму, почему равно 0.0
        System.out.println();

        if (res1 < res2) {
            System.out.println("Среднее арифметического первого массива меньше среднего арифметического второго массива");
        } else if (res1 > res2) {
            System.out.println("Среднее арифметического первого массива больше среднего арифметического второго массива");

        } else {
            System.out.println("Среднее арифметическое двух массивов равны");
        }
    }

    public static int[] fillArray(int length, int max, int min) {
        int[] result = new int[length];

        for (int i = 0; i < result.length; i++) {
            result[i] = (int) (Math.random() * (max - min + 1) + min);
            System.out.print(result[i] + "\t");
        }
        return result;
    }
}


