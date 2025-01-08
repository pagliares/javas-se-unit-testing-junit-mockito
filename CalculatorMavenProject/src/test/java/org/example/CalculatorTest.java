package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Structure I used to define the method names aiming to
 * ensure uniformity and readability:
 * test[Method]_[Condition]_[ExpectedBehavior]
 * .
 */
class CalculatorTest {

    @Test
    void testDivision_withPositiveNumbers_returnsCorrectQuotient(){
        Calculator calculator = new Calculator();
        int result = calculator.divide(15, 3);
        assertEquals(5, result);

    }
}