package hw_Lesson28.arrayMethods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.sql.Array;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethod2Test {
    ArrayMethod2 arrayMethod2;

    @BeforeEach
    void setUp() {
        arrayMethod2 = new ArrayMethod2();
    }

    @Test
    @DisplayName("количество положительных чисел")
    void sumOfPositiveElements() {
        int[] array = {-1, 2, -48, 51, 7, 0, 15, -6, -7, 4};
        assertEquals(5, arrayMethod2.sumOfPositiveElements(array));

    }

    @Test
    void sumOfNegativeElements() {
        int[] array = {-1, 2, -48, 51, 7, 0, 15, -6, -7, 4};
        assertEquals(4, arrayMethod2.sumOfNegativeElements(array));
    }

    @Test
    void sumOfOddElements() {
        int[] array = {2, 5, 6, 7, 9, -2, -4, -6};
        assertEquals(5, arrayMethod2.sumOfEvenElements(array));
    }

    @Test
    @DisplayName("проверим, если ли нули")
    void sumOfOddElements2() {
        int[] array = {0, 0, 0, 0, 0};
        assertEquals(5, arrayMethod2.sumOfEvenElements(array));
    }

    @Test
    void sumOfNullElements() {
        int[] array = {-1, 2, 0, 0, 7, 0, 15, -6, -7, 4, 0, 0};
        assertEquals(5, arrayMethod2.sumOfNullElements(array));
    }
}