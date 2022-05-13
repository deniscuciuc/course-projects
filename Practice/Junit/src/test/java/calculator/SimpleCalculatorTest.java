package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {

    @Test
    public void twoPlusTwoShouldEqualFour() {
        var simpleCalculator = new SimpleCalculator();
        assertEquals(4, simpleCalculator.add(2, 2));
    }

}