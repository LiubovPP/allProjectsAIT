package practice;

public class Application3 {
    public static void main(String[] args) {

        int[] array = {-50, -10, 20, -100, 70, -10, 60, 40, 30, 50};

        ArrayMethods3.printArray(array);
        ArrayMethods3.bubbleSort(array);
        ArrayMethods3.printArray(array);

        // вызываем binarySearch
        int index = ArrayMethods3.binarySearch(array, 20);
        System.out.println(index);
        index = ArrayMethods3.binarySearch(array, -100);
        System.out.println(index);
        index = ArrayMethods3.binarySearch(array, 70);
        System.out.println(index);
        index = ArrayMethods3.binarySearch(array, -10);
        System.out.println(index);
        index = ArrayMethods3.binarySearch(array, 100);
        System.out.println(index);
        index = ArrayMethods3.binarySearch(array, -100);
        System.out.println(index);
        index = ArrayMethods3.binarySearch(array, -200);
        System.out.println(index);
        index = ArrayMethods3.binarySearch(array, -35);
        System.out.println(index);

        int count = ArrayMethods3.searchDuplicate(array, -10);
        System.out.println("Таких элементов в массиве: " + count);
    }
}
