package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MakeUpperCaseTest {

    @Test
    public void testSomething() {
        assertEquals(
                "HELLO",
                new MakeUpperCase("hello").solution()
        );
    }

}
