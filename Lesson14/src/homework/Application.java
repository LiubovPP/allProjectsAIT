package homework;
//Задача 2. Создать 2 числовых массива, один на 10, другой на 20 элементов. Выполнить сортировку этих массивов методами:
//сортировка выбором
//пузырьковая сортировка В одном классе - методы, в другом - main.


// Добрый день, это моя первая домашняя работа Вам.
// Я слышала, что вы советуете писать комментарии, как то не особо много пишу комментарии, наверно,
// больше для себя, когда непонятно. А когда вроде понятно, то чего их и писать, в общем комментариев мало здесь.
// Мне пока нравиться дополнительный текст в консоль выводить, так понятнее кажется для моего глаза.

public class Application {
    public static void main(String[] args) {
        int[] arrayOne = new int[10];
        Methods.fillArray(arrayOne, -50, 50);
        System.out.println("Первый массив заполнен следующими случайными числами: ");
        Methods.printArray(arrayOne);
        Methods.split();
        Methods.sortArray(arrayOne);
        System.out.println("Первый массив отсрортирован методом выбора: ");
        Methods.printArray(arrayOne);
        Methods.split();
        Methods.bubbleSort(arrayOne);
        System.out.println("Первый массив отсрортирован пузырьковым методом: ");
        Methods.printArray(arrayOne);
        Methods.split();

        int[] arrayTwo = new int[20];
        Methods.fillArray(arrayTwo, -50, 50);
        System.out.println("Второй массив заполнен следующими случайными числами: ");
        Methods.printArray(arrayTwo);
        Methods.split();
        Methods.sortArray(arrayTwo);
        System.out.println("Второй массив отсрортирован методом выбора: ");
        Methods.printArray(arrayTwo);
        Methods.split();
        Methods.bubbleSort(arrayTwo);
        System.out.println("Второй массив отсрортирован пузырьковым методом: ");
        Methods.printArray(arrayTwo);
        Methods.split();
    }
}
