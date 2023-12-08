package hwLesson15;

//Задача 2.Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100. Выполните сортировку полученного массива.
//Попало ли число 0 в этот массив? (выяснить с помощью binary search) Если да, то на какое место (индекс) в массиве?
//Если нет, то на какой индекс его следует поставить?
public class Task1 {
    public static void main(String[] args) {
        int[] myArray = new int[20];
        Methods.fillArray(myArray, -100, 100);
        System.out.println("Массив заполнен следующим образом: ");
        Methods.printArray(myArray);
        Methods.bubbleSortArray(myArray);
        System.out.println("сортируем: ");
        Methods.printArray(myArray);
        System.out.println();
        int searchZero = Methods.binarySearch(myArray, 0);
        System.out.println("Индекс 0: "+searchZero);

    }
// сколько ни запускала код, увы, 0 не случался

    //System.out.println("Index = " + index);
    //        if (index >= 0) {
    //            System.out.println(0 + " presents in array, index = " + index);
    //        } else {
    //            System.out.println(0 + " doesn't presetn in array, index for possible position is " + (-index -1));
    //        }
}
