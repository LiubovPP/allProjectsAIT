package hw_Lesson29.Task3;

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
    void sumOfEvenElementsTest() {
        int [] array ={1,2,3,4,5,6,7,8,9};
        assertEquals(5,arrayMethods.sumOfEvenElements(array));
    }
    @Test
    @DisplayName("If there's no even numbers")
    void sumOfEvenElementsTest1() {
        int [] array ={9,9,9,9};
        assertEquals(0,arrayMethods.sumOfEvenElements(array));
    }
    @Test
    @DisplayName("If there's a zero")
    void sumOfEvenElementsTest2() {
        int [] array ={0,9,9,9};
        assertEquals(0,arrayMethods.sumOfEvenElements(array));
    }
}