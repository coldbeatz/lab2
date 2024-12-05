import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import calculator.services.impl.Square;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    @DisplayName("Square number")
    void square() {
        Square square = new Square();
        assertEquals(16, square.square(4));
    }
}