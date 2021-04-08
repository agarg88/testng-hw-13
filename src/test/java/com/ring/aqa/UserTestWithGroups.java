package com.ring.aqa;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.Test;

public class UserTestWithGroups {
    @BeforeGroups("smoke")
    public void setUp() {
        System.out.println("Before class method for set-up method. Creating user");
    }

    @AfterGroups("smoke")
    public void tearDown() {
        System.out.println("After class method for tear down method. Deleting user");
    }

    @AfterGroups
    public void cleaningUpDB() {
        System.out.println("After class method for tear down method. Cleaning up database");
    }

    @Test(groups = "smoke")
    public void insertDataOnUserTest() {
        System.out.println("Inside test method for inserting data into user fields");
    }

    @Test(groups = "regression")
    public void displayUserDataTest() {
        System.out.println("Inside test method for displaying user data");
    }

    @Test(dependsOnGroups = {"smoke", "regression"})
    public void searchUserTest() {
        System.out.println("Inside test method for searching a particular user");
    }

    @Test(dependsOnMethods = "insertDataOnUserTest")
    public void updateUserDataTest() {
        System.out.println("Inside test method for updating user data which runs only if insertDataOnUserTest passes");
    }

    @Test(groups = {"smoke", "ui"})
    public void validateUserDataTest() {
        System.out.println("Inside test method for validating user data and its fields");
    }

    @Test(enabled = false)
    public void countUsersTest() {
        System.out.println("Inside test method for counting total users");
    }
}
