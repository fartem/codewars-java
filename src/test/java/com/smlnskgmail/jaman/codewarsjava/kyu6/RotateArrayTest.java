package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RotateArrayTest {

    @Test
    public void testRotateOneArrayOfFive() {
        assertArrayEquals(
                new Object[]{5, 1, 2, 3, 4},
                new RotateArray(
                        new Object[]{1, 2, 3, 4, 5},
                        1
                ).solution()
        );
    }

    @Test
    public void testRotateTwoArrayOfFive() {
        assertArrayEquals(
                new Object[]{4, 5, 1, 2, 3},
                new RotateArray(
                        new Object[]{1, 2, 3, 4, 5},
                        2
                ).solution()
        );
    }

    @Test
    public void testRotateThreeArrayOfFive() {
        assertArrayEquals(
                new Object[]{3, 4, 5, 1, 2},
                new RotateArray(
                        new Object[]{1, 2, 3, 4, 5},
                        3
                ).solution()
        );
    }

    @Test
    public void testRotateFourArrayOfFive() {
        assertArrayEquals(
                new Object[]{2, 3, 4, 5, 1},
                new RotateArray(
                        new Object[]{1, 2, 3, 4, 5},
                        4
                ).solution()
        );
    }

    @Test
    public void testRotateFiveArrayOfFive() {
        assertArrayEquals(
                new Object[]{1, 2, 3, 4, 5},
                new RotateArray(
                        new Object[]{1, 2, 3, 4, 5},
                        5
                ).solution()
        );
    }

    @Test
    public void testRotateSixArrayOfFive() {
        assertArrayEquals(
                new Object[]{5, 1, 2, 3, 4},
                new RotateArray(
                        new Object[]{1, 2, 3, 4, 5},
                        6
                ).solution()
        );
    }

    @Test
    public void testRotateNegOneArrayOfFive() {
        assertArrayEquals(
                new Object[]{2, 3, 4, 5, 1},
                new RotateArray(
                        new Object[]{1, 2, 3, 4, 5},
                        -1
                ).solution()
        );
    }

    @Test
    public void testRotateNegTwoArrayOfFive() {
        assertArrayEquals(
                new Object[]{3, 4, 5, 1, 2},
                new RotateArray(
                        new Object[]{1, 2, 3, 4, 5},
                        -2
                ).solution()
        );
    }

    @Test
    public void testRotateNegThree_ArrayOfFive() {
        assertArrayEquals(
                new Object[]{4, 5, 1, 2, 3},
                new RotateArray(
                        new Object[]{1, 2, 3, 4, 5},
                        -3
                ).solution()
        );
    }

    @Test
    public void testRotateNegFourArrayOfFive() {
        assertArrayEquals(
                new Object[]{5, 1, 2, 3, 4},
                new RotateArray(
                        new Object[]{1, 2, 3, 4, 5},
                        -4
                ).solution()
        );
    }

    @Test
    public void testRotateNegFiveArrayOfFive() {
        assertArrayEquals(
                new Object[]{1, 2, 3, 4, 5},
                new RotateArray(
                        new Object[]{1, 2, 3, 4, 5},
                        -5
                ).solution()
        );
    }

    @Test
    public void testRotateNegSixArrayOfFive() {
        assertArrayEquals(
                new Object[]{2, 3, 4, 5, 1},
                new RotateArray(
                        new Object[]{1, 2, 3, 4, 5},
                        -6
                ).solution()
        );
    }

}
