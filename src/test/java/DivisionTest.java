import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import calculator.services.impl.Division;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    @Test
    @DisplayName("Divide two numbers")
    void divide() {
        Division div = new Division();
        assertEquals(1.5, div.divide(3, 2));
    }
}