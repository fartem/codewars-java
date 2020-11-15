package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfOddCubedNumbersTest {

    @Test
    public void testSomething() {
        assertEquals(
                0,
                new SumOfOddCubedNumbers(
                        new int[]{-5, -5, 5, 5}
                ).solution()
        );
        assertEquals(
                28,
                new SumOfOddCubedNumbers(
                        new int[]{1, 2, 3, 4}
                ).solution()
        );
        assertEquals(
                0,
                new SumOfOddCubedNumbers(
                        new int[]{-3, -2, 2, 3}
                ).solution()
        );
    }

}
