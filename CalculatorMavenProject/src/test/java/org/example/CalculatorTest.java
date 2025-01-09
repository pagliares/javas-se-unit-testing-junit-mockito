package org.example;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Structure I used to define the method names aiming to
 * ensure uniformity and readability:
 * test[Method]_[Condition]_[ExpectedBehavior]
 * .
 */
@DisplayName("Report with results of testing calculator mathematical operations")
class CalculatorTest {

    private Calculator calculator;

    @BeforeAll
    // The method to be executed before all others must be static!
    static void setUp() {
        System.out.println("Executing setup method annotated with @BeforeAll");
    }

    @AfterAll
    // The method to be executed after all others must be static!
    static void cleanUp() {
        System.out.println("Executing cleanUp method annotated with @AfterAll");
    }

    @BeforeEach
    void beforeEachTestMethod() {
        calculator = new Calculator();
        System.out.println("Executing beforeEachTestMethod annotated with @BeforeEach");
    }

    @AfterEach
    void afterEachTestMethod() {
        System.out.println("Executing afterEachTestMethod annotated with @AfterEach");
    }

    @Test
    @DisplayName("Test 15/3 = 5")
    void testPerformIntegerDivision_WhenFifteenIsDividedByThree_ShouldReturnFive(){
        // Two widely used code structure schemas to implement the tests:
        //   1. Arrange - Act - Assert (AAA)
        //   2. Given - When - Then (Gherkin Syntax)

        // Arrange (Given)
        int dividend = 15;
        int divisor = 3;
        int expectedResult = 5;

        // Act (When)
        int result = calculator.performIntegerDivision(15, 3);

        // Assert (Then)
        assertEquals(5, result, "15 divided by 3 did not return 5");
    }

    // Better disable than comment out the line with @Test since, disable still appears
    // In the test results
    @Disabled
    @DisplayName("4/0 - To be implemented")
    @Test
    void testPerformIntegerDivision_When_FourIsDividedByZero_ShouldThrowArithmeticException(){
        System.out.println("Test 4/0");
        int dividend = 4;
        int divisor = 0;
        int expectedResult = 0;
        fail("TODO: Not yet implemented");
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