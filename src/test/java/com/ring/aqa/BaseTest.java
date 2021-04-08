package com.ring.aqa;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before suite method");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After suite method");
    }

}
