package com.smlnskgmail.jaman.codewarsjava.kyu5;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortOneThreeTwoTest {

    @Test
    public void test() {
        assertArrayEquals(
                new int[]{8, 8, 9, 9, 10, 10},
                new SortOneThreeTwo(new int[]{8, 8, 9, 9, 10, 10}).solution()
        );
        assertArrayEquals(
                new int[]{4, 1, 3, 2},
                new SortOneThreeTwo(new int[]{1, 2, 3, 4}).solution()
        );
        assertArrayEquals(
                new int[]{9, 999, 99},
                new SortOneThreeTwo(new int[]{9, 99, 999}).solution()
        );
    }

}
