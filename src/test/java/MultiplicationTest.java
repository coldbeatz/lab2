import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import calculator.services.impl.Multiplication;

import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        Multiplication multiplication = new Multiplication();
        assertEquals(6, multiplication.multiply(2, 3));
    }
}