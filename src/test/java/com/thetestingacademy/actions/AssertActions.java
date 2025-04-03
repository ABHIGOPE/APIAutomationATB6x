package com.thetestingacademy.actions;

import static org.testng.Assert.assertEquals;

public class AssertActions {

    public void verifyResponseBody(String actual, String expected, String description) {

                assertEquals(actual,expected,description);
    }

    public void verifyResponseBody(float actual, float expected, float description) {

        assertEquals(actual,expected,description);
    }

    public void verifyResponseBody(int actual, int expected, int description) {

        assertEquals(actual,expected,description);
    }

    public void verifyResponseBody(double actual, double expected, double description) {

        assertEquals(actual,expected,description);
    }
}
