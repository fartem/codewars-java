package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ThisIsAProblemTest {

    @Test
    public void testNameMeOne() {
        ThisIsAProblem thisIsAProblem = new ThisIsAProblem("John", "Doe");

        assertEquals(
                "John",
                thisIsAProblem.getFirstName()
        );
        assertEquals(
                "Doe",
                thisIsAProblem.getLastName()
        );
        assertNotEquals(
                "JohnDoe",
                thisIsAProblem.getFullName()
        );
        assertEquals(
                "John Doe",
                thisIsAProblem.getFullName()
        );
    }

}
