package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayPlusArrayTest {

    @Test
    public void sampleTests() {
        assertEquals(
                21,
                new ArrayPlusArray(
                        new int[] { 1, 2, 3 },
                        new int[] { 4, 5, 6 }
                ).result()
        );
        assertEquals(
                -21,
                new ArrayPlusArray(
                        new int[] { -1, -2, -3 },
                        new int[] { -4, -5, -6 }
                ).result()
        );
        assertEquals(
                15,
                new ArrayPlusArray(
                        new int[] { 0, 0, 0 },
                        new int[] { 4, 5, 6 }
                ).result()
        );
        assertEquals(
                2100,
                new ArrayPlusArray(
                        new int[] { 100, 200, 300 },
                        new int[] { 400, 500, 600 }
                ).result()
        );
    }

}
