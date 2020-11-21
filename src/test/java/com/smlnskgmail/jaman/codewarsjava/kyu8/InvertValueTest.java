package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class InvertValueTest {

    @Test
    public void testSomething() {
        assertEquals(
                Arrays.toString(new int[]{1, 2, 3, 4, 5}),
                Arrays.toString(
                        new InvertValue(
                                new int[]{-1, -2, -3, -4, -5}
                        ).solution()
                )
        );
        assertEquals(
                Arrays.toString(new int[]{-1, 2, -3, 4, -5}),
                Arrays.toString(
                        new InvertValue(
                                new int[]{1, -2, 3, -4, 5}
                        ).solution()
                )
        );
        assertEquals(
                Arrays.toString(new int[]{}),
                Arrays.toString(
                        new InvertValue(new int[]{}).solution()
                )
        );
        assertEquals(
                Arrays.toString(new int[]{0}),
                Arrays.toString(
                        new InvertValue(new int[]{0}).solution()
                )
        );
    }

}
