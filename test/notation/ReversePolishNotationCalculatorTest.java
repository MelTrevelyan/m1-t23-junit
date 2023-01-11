package notation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReversePolishNotationCalculatorTest {

    ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();

    @Test
    public void shouldCalculateAddition() {
        Assertions.assertEquals(6, calculator.calculatePolishNotation("1 2 3 + +"));
    }

    @Test
    public void shouldCalculateSubtraction() {
        Assertions.assertEquals( 2, calculator.calculatePolishNotation("3 2 1 - -"));
    }

    @Test
    public void shouldCalculateMultiplication() {
        Assertions.assertEquals(6, calculator.calculatePolishNotation("1 2 3 * *"));
    }

    @Test
    public void shouldProperlyHandleNegativeNumbers() {
        Assertions.assertEquals(-5, calculator.calculatePolishNotation("-1 -2 -3 -4 + - *"));

    }

    @Test
    public void shouldProperlyHandleBlanks() {
        Assertions.assertEquals(7, calculator.calculatePolishNotation("4 3 2 1    - * +"));
    }
}