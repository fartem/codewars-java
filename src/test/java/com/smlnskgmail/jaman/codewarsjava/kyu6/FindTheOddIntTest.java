package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTheOddIntTest {

    @Test
    public void findTest() {
        assertEquals(
                5,
                new FindTheOddInt(new int[]{20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5}).solution()
        );
        assertEquals(
                -1,
                new FindTheOddInt(new int[]{1, 1, 2, -2, 5, 2, 4, 4, -1, -2, 5}).solution()
        );
        assertEquals(
                5,
                new FindTheOddInt(new int[]{20, 1, 1, 2, 2, 3, 3, 5, 5, 4, 20, 4, 5}).solution()
        );
        assertEquals(
                10,
                new FindTheOddInt(new int[]{10}).solution()
        );
        assertEquals(
                10,
                new FindTheOddInt(new int[]{1, 1, 1, 1, 1, 1, 10, 1, 1, 1, 1}).solution()
        );
        assertEquals(
                1,
                new FindTheOddInt(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10}).solution()
        );
    }

}
