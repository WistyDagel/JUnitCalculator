import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        //arrange
        double expectedResult = 15;

        //act
        double actualResult = Calculator.Add(10, 5);

        //assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void subtract() {
        //arrange
        double expectedResult = 5;

        //act
        double actualResult = Calculator.Subtract(10, 5);

        //assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void multiply() {
        //arrange
        double expectedResult = 25;

        //act
        double actualResult = Calculator.Multiply(5, 5);

        //assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide() {
        //arrange
        double expectedResult = 2;

        //act
        double actualResult = Calculator.Divide(10, 5);

        //assert
        assertEquals(expectedResult, actualResult);
    }
}