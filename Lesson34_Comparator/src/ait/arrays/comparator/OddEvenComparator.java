package ait.arrays.comparator;

import java.util.Arrays;
import java.util.Comparator;

//Напишите OddEvenComparator, реализующий Comparator с методом сравнения для сортировки массива целых чисел в следующем 
//порядке: Четные целые числа должны идти перед нечетными числами.
public class OddEvenComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
//        if (o1 % 2 == 0 || o2 % 2 == 0) {
//            return -1;
//        } else if () {
//
//        }
        return (o1 % 2) - (o2 % 2);
        // {1, 2, 3, 4}
        // i % 2 == 0 (-1)
        // 1 % 2 == 1 || 1 % 2 == 0
    }
}
