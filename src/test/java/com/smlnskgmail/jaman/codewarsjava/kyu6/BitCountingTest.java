package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BitCountingTest {

    @Test
    public void testGame() {
        assertEquals(
                5,
                new BitCounting(1234).solution()
        );
        assertEquals(
                1,
                new BitCounting(4).solution()
        );
        assertEquals(
                3,
                new BitCounting(7).solution()
        );
        assertEquals(
                2,
                new BitCounting(9).solution()
        );
        assertEquals(
                2,
                new BitCounting(10).solution()
        );
    }

}
