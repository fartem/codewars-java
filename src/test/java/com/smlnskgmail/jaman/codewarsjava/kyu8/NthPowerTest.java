package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NthPowerTest {

    @Test
    public void basicTests() {
        assertEquals(
                -1,
                new NthPower(new int[] { 1, 2 }, 2).solution()
        );
        assertEquals(
                8,
                new NthPower(new int[] { 3, 1, 2, 2 }, 3).solution()
        );
        assertEquals(
                4,
                new NthPower(new int[] { 3, 1, 2 }, 2).solution()
        );
    }

}
