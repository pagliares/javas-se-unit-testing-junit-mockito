package org.example;

import org.junit.jupiter.api.*;

/**
 * We can change the test lifecycle
 * By default, it is configured as per-method test lifecycle with the annotation
 * TestInstance.Lifecycle.PER_METHOD
 * (one instance of this class for each method in it)
 * where the execution order is deterministic, but intentionally non-obvious.
 * Another option is to have a single instance of this test class for all its test methods
 * by using TestInstance.Lifecycle.PER_CLASS
 * And this is very helpful when working with integration tests because now your test methods can share
 * state stored in object instance variables.
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS) // default configuration
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedByIndexExampleTest {

    StringBuilder completed = new StringBuilder("");

    @AfterEach
    void afterEach(){
        System.out.println("The state of the instance object is : " + completed);
    }

    @Order(1)
    @Test
    void testA(){
        System.out.println("Running test A");
        completed.append("1");
    }

    @Order(4)
    @Test
    void testB(){
        System.out.println("Running test B");
        completed.append("2");
    }

    @Order(3)
    @Test
    void testC(){
        System.out.println("Running test C");
        completed.append("3");
    }

    @Order(2)
    @Test
    void testD(){
        System.out.println("Running test D");
        completed.append("4");
    }
}
