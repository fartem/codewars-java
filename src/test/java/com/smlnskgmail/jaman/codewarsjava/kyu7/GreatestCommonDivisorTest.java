package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreatestCommonDivisorTest {

    @Test
    public void testGcd() {
        assertEquals(
                6,
                new GreatestCommonDivisor(30, 12).solution()
        );
        assertEquals(
                1,
                new GreatestCommonDivisor(8, 9).solution()
        );
        assertEquals(
                1,
                new GreatestCommonDivisor(1, 1).solution()
        );
    }

}
