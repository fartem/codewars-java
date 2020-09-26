package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StringEndsWithTest {

    @Test
    public void basicTest() {
        assertTrue(
                new StringEndsWith("test", "t").solution()
        );
    }

}
