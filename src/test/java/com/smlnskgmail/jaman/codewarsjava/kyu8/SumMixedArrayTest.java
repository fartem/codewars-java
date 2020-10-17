package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SumMixedArrayTest {

    @Test
    public void test() {
        assertEquals(
                10,
                new SumMixedArray(
                        Arrays.asList(5, "5")
                ).solution()
        );
        assertEquals(
                22,
                new SumMixedArray(
                        Arrays.asList(9, 3, "7", "3")
                ).solution()
        );
        assertEquals(
                42,
                new SumMixedArray(
                        Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)
                ).solution()
        );
        assertEquals(
                41,
                new SumMixedArray(
                        Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")
                ).solution()
        );
        assertEquals(
                45,
                new SumMixedArray(
                        Arrays.asList("1", "5", "8", 8, 9, 9, 2, "3")
                ).solution()
        );
        assertEquals(
                41,
                new SumMixedArray(
                        Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")
                ).solution()
        );
        assertEquals(
                61,
                new SumMixedArray(
                        Arrays.asList(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7)
                ).solution()
        );
    }

}
