package org.example.service;

import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UserServiceImplTest {

    /**
     * Since there is going to be only one single instance of this class
     * as configured with @TestInstance(TestInstance.Lifecycle.PER_CLASS)
     * the methods annotated with @BeforeAll and @AfterAll lifecycle test methods may not be static.
     * If you remember from previous lessons for these two lifecycle methods to work,
     * they needed to be static.
     * If I comment out the test instance annotation and enable the default behavior
     * where a new instance of a class is created for each test method as configured with
     * @TestInstance(TestInstance.Lifecycle.PER_METHOD)
     * Then in that case, the before and after all methods will need to be static.
     * But for a single instance of a class, or when you use this instance,
     * lifecycle per class configuration,these two methods do not need to be static.
     */
    @BeforeAll
    void setup() {
        // Create & initialize database
    }

    @AfterAll
    void cleanup() {
        // Close connection
        // Delete database
    }

    @Test
    @Order(1)
    @DisplayName("Create User works")
    void testCreateUser_whenProvidedWithValidDetails_returnsUserId() {

    }


    @Test
    @Order(2)
    @DisplayName("Update user works")
    void testUpdateUser_whenProvidedWithValidDetails_returnsUpdatedUserDetails() {

    }

    @Test
    @Order(3)
    @DisplayName("Find user works")
    void testGetUserDetails_whenProvidedWithValidUserId_returnsUserDetails() {

    }

    @Test
    @Order(4)
    @DisplayName("Delete user works")
    void testDeleteUser_whenProvidedWithValidUserId_returnsUserDetails() {

    }

}
