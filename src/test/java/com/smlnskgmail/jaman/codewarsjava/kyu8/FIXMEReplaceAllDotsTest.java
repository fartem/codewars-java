package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FIXMEReplaceAllDotsTest {

    @Test
    public void testSomeDots() {
        assertEquals(
                "one-two-three",
                new FIXMEReplaceAllDots("one.two.three").solution()
        );
    }

}
