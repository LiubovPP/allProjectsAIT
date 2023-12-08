package ait.arrays.test;

import ait.arrays.utils.ArrayTools;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Predicate;

class ArrayToolsTest {
    Integer[] arrNum;
    String[] arrStr;

    @BeforeEach
    void setUp() {
        arrNum = new Integer[]{9, 7, 4, 7, 2, 5, 1, 0};
        arrStr = new String[]{"one", "two", "three", "four", "five"};
    }

    @Test
    void printArrayTest() {
        System.out.println("=========printArrayTest==========");
        ArrayTools.printArray(arrNum);
        ArrayTools.printArray(arrStr);
    }

    @Test
    void searchTest() {
        System.out.println("=============searchTest==========");
        int index = ArrayTools.search(arrStr, "four");
        System.out.println("index = " + index);
        index = ArrayTools.search(arrStr, "six");
        System.out.println("index = " + index);
        index = ArrayTools.search(arrNum, 4);
        System.out.println("index = " + index);
        index = ArrayTools.search(arrNum, 6);
        System.out.println("index = " + index);
        index = ArrayTools.search(arrNum, "4");
        System.out.println("index = " + index);
    }

    @Test
    void findByPredicateTest() {
        System.out.println("=============findByPredicateTest===============");
//        Predicate<Integer> predicate = new Predicate<Integer>() { // анонимный класс
//            @Override
//            public boolean test(Integer integer) {
//                return integer < 5;
//            }
//        };  с лямбдой выражением упрощаем:

//        Predicate <Integer> predicate = (Integer integer)->{
//            return integer<5;
//        };
        // и еще проще:

//        Predicate<Integer> predicate = integer -> integer < 5; // или n -> n<5
//        Integer num = ArrayTools.findByPredicate(arrNum, predicate);
//
        // или еще проще:
        Integer num = ArrayTools.findByPredicate(arrNum, n -> n < 5);

        System.out.println(num);
        num = ArrayTools.findByPredicate(arrNum, n -> n % 5 == 0);
        System.out.println(num);
        String str = ArrayTools.findByPredicate(arrStr, s -> s.length() == 4);
        System.out.println(str);
    }

    @Test
    void bubbleSortTest() {
        System.out.println("=============bubbleSortTest===============");
        ArrayTools.bubbleSort(arrNum);
        ArrayTools.printArray(arrNum);
        ArrayTools.bubbleSort(arrStr);// сортируем по алфавиту - natural order
        ArrayTools.printArray(arrStr);

    }

    @Test
    void bubbleSortComparatorTest() {
        System.out.println("=============bubbleSortComparatorTest===============");
        ArrayTools.bubbleSort(arrNum, (n1, n2) -> n2 - n1);
        ArrayTools.printArray(arrNum);
        ArrayTools.bubbleSort(arrStr, (s1, s2) -> s1.length() - s2.length());// сортируем по кол-ву символов
        ArrayTools.printArray(arrStr);
        ArrayTools.bubbleSort(arrStr, (s1, s2) -> s2.length() - s1.length());// сортируем по кол-ву символов наоборот
        ArrayTools.printArray(arrStr);
    }
    @Test
    void OddEvenComparatorTest (){

    }

}