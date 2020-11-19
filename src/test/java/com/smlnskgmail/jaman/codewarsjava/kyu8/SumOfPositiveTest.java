package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfPositiveTest {

    @Test
    public void testSomething() {
        assertEquals(
                15,
                new SumOfPositive(new int[]{1, 2, 3, 4, 5}).solution()
        );
        assertEquals(
                13,
                new SumOfPositive(new int[]{1, -2, 3, 4, 5}).solution()
        );
        assertEquals(
                0,
                new SumOfPositive(new int[]{}).solution()
        );
        assertEquals(
                0,
                new SumOfPositive(new int[]{-1, -2, -3, -4, -5}).solution()
        );
        assertEquals(
                9,
                new SumOfPositive(new int[]{-1, 2, 3, 4, -5}).solution()
        );
    }

}
