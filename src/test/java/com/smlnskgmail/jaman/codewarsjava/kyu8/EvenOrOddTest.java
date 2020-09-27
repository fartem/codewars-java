package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EvenOrOddTest {

    @Test
    public void testEvenOrOdd() {
        assertEquals(
                new EvenOrOdd(6).solution(),
                "Even"
        );
        assertEquals(
                new EvenOrOdd(7).solution(),
                "Odd"
        );
    }

}
