package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ClosestToZeroTest {

    @Test
    public void find() {
        assertEquals(
                Integer.valueOf(1),
                new ClosestToZero(
                        new int[]{10, 3, 9, 1}
                ).solution()
        );
        assertEquals(
                Integer.valueOf(-1),
                new ClosestToZero(
                        new int[]{2, 4, -1, -3}
                ).solution()
        );
        assertEquals(
                Integer.valueOf(0),
                new ClosestToZero(
                        new int[]{13, 0, -6}
                ).solution()
        );
    }

    @Test
    public void shouldReturnNone() {
        assertNull(
                new ClosestToZero(
                        new int[]{5, 1, -1, 2, -10}
                ).solution()
        );
        assertNull(
                new ClosestToZero(
                        new int[]{5, 11, 11, 2, -1, 1}
                ).solution()
        );
    }

}
