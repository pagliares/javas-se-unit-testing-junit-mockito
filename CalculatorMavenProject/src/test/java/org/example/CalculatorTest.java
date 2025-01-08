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
        assertEquals(5, result, "15 divided by 3 did not return 3");

    }

    @Test
    void testSubtraction_withPositiveNumbers_returnsCorrectDifference(){
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 3);
        assertEquals(2, result, "5 subtracted by 3 did not return 2");

    }

}