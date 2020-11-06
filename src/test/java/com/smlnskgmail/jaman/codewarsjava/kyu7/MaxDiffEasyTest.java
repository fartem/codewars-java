package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxDiffEasyTest {

    @Test
    public void basicTests() {
        assertEquals(
                4,
                new MaxDiffEasy(
                        new int[] { 1, 2, 3, 4, 5, 5, 4 }
                ).solution()
        );
        assertEquals(
                30,
                new MaxDiffEasy(
                        new int[] { -4, -5, -3, -1, -31 }
                ).solution()
        );
        assertEquals(
                10,
                new MaxDiffEasy(
                        new int[] { 1, 2, 3, 4, -5, 5, 4 }
                ).solution()
        );
        assertEquals(
                0,
                new MaxDiffEasy(new int[] { 1000000 }).solution()
        );
        assertEquals(
                0,
                new MaxDiffEasy(new int[] {}).solution()
        );
    }

}
