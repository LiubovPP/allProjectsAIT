package hw_Lesson28.isPrime;
import org.junit.Test;
import static org.junit.Assert.*;

public class PrimeCheckerTest {

    @Test
    public void testIsPrimeWithPrimeNumber() {
        assertTrue(PrimeChecker.isPrime(17));
        assertTrue(PrimeChecker.isPrime(19));
        assertTrue(PrimeChecker.isPrime(2));
    }

    @Test
    public void testIsPrimeWithNonPrimeNumber() {
        assertFalse(PrimeChecker.isPrime(1));
        assertFalse(PrimeChecker.isPrime(4));
        assertFalse(PrimeChecker.isPrime(10));
    }

    @Test
    public void testIsPrimeWithNegativeNumber() {
        assertFalse(PrimeChecker.isPrime(-5));
    }
}
//package homework.prime_number;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class PrimeNumberTest {
//
//    PrimeNumber primeNumber;
//
//    @BeforeEach
//    void setUp() {
//        primeNumber = new PrimeNumber();
//    }
//
//    @Test
//    void isPrimeTest() {
//        int n = 20;
//        assertFalse(primeNumber.isPrime(n));
//        n = 19;
//        assertTrue(primeNumber.isPrime(n));
//    }
//}