package com.ring.aqa;

import org.testng.annotations.Test;

public class TestWithPriority {

    @Test(priority = 3)
    public void test1() {
        System.out.println("Running test 1");
    }

    @Test(priority = 2)
    public void test2() {
        System.out.println("Running test 2");
    }

    @Test(priority = 1)
    public void test3() {
        System.out.println("Running test 3");
    }
}
