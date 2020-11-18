package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EqualSidesOfAnArrayTest {

    @Test
    public void test() {
        assertEquals(
                3,
                new EqualSidesOfAnArray(new int[]{1, 2, 3, 4, 3, 2, 1}).solution()
        );
        assertEquals(
                1,
                new EqualSidesOfAnArray(new int[]{1, 100, 50, -51, 1, 1}).solution()
        );
        assertEquals(
                -1,
                new EqualSidesOfAnArray(new int[]{1, 2, 3, 4, 5, 6}).solution()
        );
        assertEquals(
                3,
                new EqualSidesOfAnArray(new int[]{20, 10, 30, 10, 10, 15, 35}).solution()
        );
        assertEquals(
                -1,
                new EqualSidesOfAnArray(new int[]{-8505, -5130, 1926, -9026}).solution()
        );
        assertEquals(
                1,
                new EqualSidesOfAnArray(new int[]{2824, 1774, -1490, -9084, -9696, 23094}).solution()
        );
        assertEquals(
                6,
                new EqualSidesOfAnArray(new int[]{4, 5, 6, 7, 8, 9, 10, 9, 8, 7, 6, 5, 4}).solution()
        );
    }

}
