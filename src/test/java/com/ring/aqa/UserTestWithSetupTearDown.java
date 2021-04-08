package com.ring.aqa;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UserTestWithSetupTearDown extends BaseTest {
    @BeforeClass
    public void setUp() {
        System.out.println("Before class method for set-up method. Creating user");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("After class method for tear down method. Deleting user");
    }

    @AfterClass
    public void cleaningUpDB() {
        System.out.println("After class method for tear down method. Cleaning up database");
    }

    @Test
    public void insertDataOnUserTest() {
        System.out.println("Inside test method for inserting data into user fields");
    }

    @Test
    public void displayUserDataTest() {
        System.out.println("Inside test method for displaying user data");
    }
}
