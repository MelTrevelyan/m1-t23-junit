package notation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReversePolishNotationCalculatorTest {

    //сделать private (вместо package private) 
    ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();

    @Test
    public void shouldCalculateAddition() {
        Assertions.assertEquals(6, calculator.calculatePolishNotation("1 2 3 + +"));
    }

    @Test
    public void shouldCalculateSubtraction() {
        Assertions.assertEquals(2, calculator.calculatePolishNotation("3 2 1 - -"));
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
    
    // хорошие тесты) Решил свои сделать тоже посложнее, после проверки твоей работы!
    // лично я бы еще добавил проверку на то, что другие операции не поддерживаются 
    // суть проверки в вызове ожидаемого исключения 
    // еще бы, я передал в метод неверное количество аргументов, для проверки пробела !

}
