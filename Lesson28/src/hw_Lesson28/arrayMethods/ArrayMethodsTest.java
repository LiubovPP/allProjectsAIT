package hw_Lesson28.arrayMethods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodsTest {
    ArrayMethods arrayMethods;

    @BeforeEach
    void setUp() {
        arrayMethods = new ArrayMethods();
    }

    @Test
    @DisplayName("В этом ТЕСТЕ мы тестируем сумму целых положительных чисел")
    void sumArrayTest() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertEquals(45, arrayMethods.sumArray(array));
    }

    @Test
    @DisplayName("тестируем сумму целых положительных, отрицательных чисел и нуля")
    void sumArray1Test() {
        int[] array = {-1, 2, 3, 4, 5, 0, 6, 7, 8, -9};
        assertEquals(25, arrayMethods.sumArray(array));
    }

    @Test
    @DisplayName("тестируем нахождение элемента из массива")
    void arrayElementTest() {
        int[] array = {-1, 2, 3, 4, 5, 0, 6, 7, 8, -9};
        int element = 5;
        assertEquals(4, arrayMethods.arrayElement(array, element));
    }

    @Test
    @DisplayName("тестируем нахождение элемента не из массива")
    void arrayNotElementTest() {// Здесь как раз получилось сначала написать и провалить тест, затем дописать метод
        int[] array = {-1, 2, 3, 4, 5, 0, 6, 7, 8, -9};
        int element = 15;
        assertEquals(-1, arrayMethods.arrayElement(array, element));
    }
    @Test
    @DisplayName("тестируем нахождение элемента из массива")
    void arrayFoundElementTest() {
        int[] array = {-1, 2, 3, 4, 5, 0, 6, 7, 8, 9,1,15};
        int element = 15;
        assertEquals(11, arrayMethods.binarySearch(array, element));
    }
    @Test
    @DisplayName("тестируем нахождение элемента не из массива")
    void arrayNotFoundElementTest() {
        int[] array = {-1, 2, 3, 4, 5, 0, 6, 7, 8, -9};
        int element = 15;
        assertEquals(-1, arrayMethods.binarySearch(array, element));
    }
}