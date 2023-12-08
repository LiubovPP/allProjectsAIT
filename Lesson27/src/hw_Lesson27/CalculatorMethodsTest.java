package hw_Lesson27;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorMethodsTest {
    CalculatorMethods calculatorMethods;

    @BeforeEach
    void setUp() {
        calculatorMethods = new CalculatorMethods();
    }

    @Test
    void additionTest() {
        assertEquals(20,calculatorMethods.addition(7,13));
    }

    @Test
    void subtractionTest() {
        assertEquals(90, calculatorMethods.subtraction(100,10));
    }

    @Test
    void divisionTest() {
        assertEquals(3,calculatorMethods.division(45,15));
    }

    @Test
    void multiplyTest() {
        assertEquals(90, calculatorMethods.multiply(45,2));
    }
}