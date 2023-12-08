package ait.arrays.comparator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class OddEvenComparatorTest {
Integer[] integer;

    @BeforeEach
    void setUp() {
    }

    @Test
    void compare() {
        Integer[] origin = { 1, 4, 3, 2, 5, 6, 9, 8, 7, 3 };

        Integer[] expected = { 2, 4, 6, 8, 9, 7, 5, 3, 3, 1 };
        Comparator <Integer> comparator= new OddEvenComparator();
        Arrays.sort(origin,comparator);
        assertArrayEquals(expected,origin);
    }
}