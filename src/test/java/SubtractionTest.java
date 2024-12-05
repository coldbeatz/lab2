import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import calculator.services.impl.Subtraction;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionTest {

    @Test
    @DisplayName("Sub two numbers")
    void minus() {
        Subtraction subtraction = new Subtraction();
        assertEquals(5, subtraction.minus(8, 3));
    }
}