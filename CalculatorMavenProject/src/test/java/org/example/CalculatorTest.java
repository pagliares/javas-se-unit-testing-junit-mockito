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
    void testPerformIntegerDivision_WhenFifteenIsDividedByThree_ShouldReturnFive(){
        Calculator calculator = new Calculator();
        int result = calculator.performIntegerDivision(15, 3);
        assertEquals(5, result, "15 divided by 3 did not return 5");
    }

    @Test
    void testPerformIntegerSubtraction_WhenThreeIsSubtractedFromFive_ShouldReturnTwo(){
        Calculator calculator = new Calculator();
        int minuend = 5;
        int subtrahend = 3;
        int expectedResult = 2;

        int result = calculator.performIntegerSubtraction(minuend, subtrahend);

        /*
            Instead of using:

            assertEquals(expectedResult, result, minuend + " " + subtrahend + " did not return " + expectedResult);

            I prefer using  lambda expression that has better performance, since this third parameter
            is executed ONLY when the test fail:

            assertEquals(expectedResult, result, minuend + " " + subtrahend + " did not return " + expectedResult);

        */
        assertEquals(expectedResult, result, () -> minuend + "-" + subtrahend + " did not return " + expectedResult);

    }

}