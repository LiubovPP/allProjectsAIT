package homework;

import practice.ArrayMethods;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
// от Алекса
public class TestSortArrayInt {
    public static void main(String[] args) {
        long before;
        long after;
        int[] arrayUnsorted;
        long difference;


        int[] array = ArrayMethods.createAndFillArray(50000, 1, 100);
        //System.out.println(Arrays.toString(array));
        arrayUnsorted = arrayCopy(array);

        before = new Date().getTime();
        int [] arraySortedBubbleSort = ArrayMethods.bubbleSort(arrayUnsorted);
        after = new Date().getTime();
        //System.out.println(Arrays.toString(arraySortedBubbleSort));
        difference = after - before;
        System.out.println("Метод Bubble Sort занял    : " + difference + " мс");
        System.out.println("---------------------------------");


        ////////////////////////////////////////////////////////

        arrayUnsorted = arrayCopy(array);
        //System.out.println(Arrays.toString(arrayUnsorted));

        before = new Date().getTime();
        int[]arraySortedSelectSort = ArrayMethods.selectionSort(arrayUnsorted);
        after = new Date().getTime();
        //System.out.println(Arrays.toString(arraySortedSelectSort));
        difference = after - before;
        System.out.println("Метод Selection Sort занял : " + difference + " мс");
        System.out.println("---------------------------------");


        ///////////////////////////////////////////////////////////////


        // arrayUnsorted = arrayCopy(array);
        //System.out.println(Arrays.toString(array));
        before = new Date().getTime();
        Arrays.sort(array);
        after = new Date().getTime();
        //System.out.println(Arrays.toString(array));
        difference = after - before;
        System.out.println("Метод Arrays.sort занял    : " + difference + " мс");







    }
    public static int[] arrayCopy(int[] arr) {
        int[] copyOfArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            copyOfArr[i] = arr[i];
        }
        return copyOfArr;

    }
}
