package hwLesson17.Pelmeni;

//Задача 2. (повторение и закрепление темы массивы, заполнение массива с помощью датчика случайных чисел) Задача про
//поиск "счастливого пельменя". Часть 1. Хозяйка налепила для гостей 30 пельменей, каждый весом от 25 до 35 грамм.
//Напишите программу, которая занесет в массив данные о весе каждого слепленного пельменя. Часть 2. Хозяйка налепила
//для гостей 30 пельменей. В один из пельменей она положила монету, которая увеличивает вес пельменя на 15 грамм.
//Напишите программу, которая ищет счастливый пельмень.
public class Pelmeni {
    public static void main(String[] args) {
        int[] Pelmeni = new int[30];//Хозяйка налепила для гостей 30 пельменей
        fillArray(Pelmeni, 25, 35);//программу, которая занесет в массив данные о весе каждого слепленного пельменя
        printArray(Pelmeni);
        System.out.println();
        System.out.println();
        System.out.println("Новые 30 пельменей");
        happyPelmen(Pelmeni, 25, 35);//счастливый пельмень.
    }

    // Методы не стала выносить в отдельный класс
    public static void fillArray(int[] arr, int a, int b) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (b - a + 1) + a);
        }

    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();
    }

    public static void happyPelmen(int[] array, int x, int y) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (y - x + 1) + x);
            System.out.print(array[i] + "  ");
        }
        int happyPelmen = (int) (Math.random() * (y - x + 1) + x);
        array[happyPelmen] += 15;
        System.out.println();
        System.out.println("счастливый пельмень с монетой весит " + array[happyPelmen] + " грамм");

        for (int j = 0; j < array.length; j++) {
            if (j == happyPelmen) {
                int indexHappyPelmen = array[j];
                System.out.println("Это счастливый пельмень с монетой! (под номером изготовления пельменя) " + happyPelmen);
            }
        }

    }
}


