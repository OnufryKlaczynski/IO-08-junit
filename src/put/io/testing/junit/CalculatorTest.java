package put.io.testing.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void shouldReturnTwo() {
        Assertions.assertEquals(2, calculator.add(1, 1));
    }

    @Test
    public void shouldReturnThree() {
        Assertions.assertEquals(3, calculator.multiply(1, 3));
    }

    @Test
    public void shouldThrowIllegalArgument() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.addPositiveNumbers(-1, 0));
    }
}