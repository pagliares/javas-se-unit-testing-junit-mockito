package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Structure I used to define the method names aiming to
 * ensure uniformity and readability:
 * test[Method]_[Condition]_[ExpectedBehavior]
 * .
 */
@DisplayName("Report with results of testing calculator mathematical operations")
class CalculatorTest {

    @Test
    @DisplayName("Test 15/3 = 5")
    void testPerformIntegerDivision_WhenFifteenIsDividedByThree_ShouldReturnFive(){
        Calculator calculator = new Calculator();
        int result = calculator.performIntegerDivision(15, 3);
        assertEquals(5, result, "15 divided by 3 did not return 5");
    }

    @Test
    @DisplayName("Test 5-3 = 2")
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