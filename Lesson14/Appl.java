package Lesson14;

public class Appl {

    public static void main(String[] args) {
        int [] array = {-12,5,36,28,-16,100,82,64,57,1,5};
        System.out.println("Массив до сортировки");
        BubbleSort2.printArray(array);
        BubbleSort2.bubbleSort(array);
        System.out.println("Массив после сортировки");
        BubbleSort2.printArray(array);
    }
}
