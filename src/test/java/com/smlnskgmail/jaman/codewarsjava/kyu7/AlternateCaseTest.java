package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlternateCaseTest {

    @Test
    public void testSomething() {
        assertEquals(
                "",
                new AlternateCase("").solution()
        );
        assertEquals(
                "ABC",
                new AlternateCase("abc").solution()
        );
        assertEquals(
                "abc",
                new AlternateCase("ABC").solution()
        );
        assertEquals(
                "hELLO wORLD!",
                new AlternateCase("Hello World!").solution()
        );
    }

}
