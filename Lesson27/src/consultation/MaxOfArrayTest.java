package consultation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxOfArrayTest {
    MaxOfArray maxOfArray; // поле класса

    @BeforeEach
    void setUp() {
        maxOfArray = new MaxOfArray();
    }

    @Test
    void maxOfArrayTest() {
        int[] arr = {-50, 100, 1, 15, -64, 85, -3};
        assertEquals(1, maxOfArray.maxOfArray(arr));
    }
}