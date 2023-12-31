package ait.arrays.utils;

import java.util.Comparator;
import java.util.function.Predicate;

public class ArrayTools {
    public static void printArray(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("=======================================");
    }

    public static <T> int search(T[] arr, T value) { // Generic <T> только внутри метода
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public static <T> T findByPredicate(T[] arr, Predicate<T> predicate) {
        for (int i = 0; i < arr.length; i++) {
            if (predicate.test(arr[i])) {
                return arr[i];
            }

        }
        return null;
    }

    public static <T extends Comparable<T>> void bubbleSort(T[] arr) { // переписали BubbleSort как универсальный через Comparable
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                // if (arr[j]>arr[j+1]) или:
                // if (arr[j] - arr[j + 1] > 0)
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    public static <T> void bubbleSort(T[] arr, Comparator<T> comparator) { // переписали BubbleSort как универсальный через Comparator
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                // if (arr[j]>arr[j+1]) или:
                // if (arr[j] - arr[j + 1] > 0)
                if (comparator.compare(arr[j], arr[j + 1]) > 0) {
                    T t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
    }

    //Task 1
    //Write OddEvenComparator implementing Comparator with the method compare for sorting an array of Integers in the
    // order: The even integers should go before odd numbers.

//    public static <T> void OddEvenComparator(T[] arr, Comparator<T> comparator) {
//                 for (int j = 0; j < arr.length - 1; j++) {
//                if (comparator.compare(arr[j].equals()%2 =0) {
//                    arr[j]++;
//
//                }
//            }
//        }
//    }
}
