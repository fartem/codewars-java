package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SortTheOddTest {

    @Test
    public void exampleTest1() {
        assertArrayEquals(
                new int[]{1, 3, 2, 8, 5, 4},
                new SortTheOdd(new int[]{5, 3, 2, 8, 1, 4}).solution()
        );
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(
                new int[]{1, 3, 5, 8, 0},
                new SortTheOdd(new int[]{5, 3, 1, 8, 0}).solution()
        );
    }

    @Test
    public void exampleTest3() {
        assertArrayEquals(
                new int[]{},
                new SortTheOdd(new int[]{}).solution()
        );
    }

}
