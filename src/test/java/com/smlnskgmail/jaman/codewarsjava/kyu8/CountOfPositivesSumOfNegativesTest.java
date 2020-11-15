package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CountOfPositivesSumOfNegativesTest {

    @Test
    public void countPositivesSumNegatives_BasicTest() {
        assertArrayEquals(
                new int[]{10, -65},
                new CountOfPositivesSumOfNegatives(
                        new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15}
                ).solution()
        );
    }

    @Test
    public void countPositivesSumNegatives_InputWithZeroes() {
        assertArrayEquals(
                new int[]{8, -50},
                new CountOfPositivesSumOfNegatives(
                        new int[]{0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14}
                ).solution()
        );
    }

}
