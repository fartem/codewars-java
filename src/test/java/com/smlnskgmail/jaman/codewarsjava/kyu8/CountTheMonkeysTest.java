package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CountTheMonkeysTest {

    @Test
    public void basicTests() {
        assertArrayEquals(
                new int[]{1, 2, 3, 4, 5},
                new CountTheMonkeys(5).solution()
        );
        assertArrayEquals(
                new int[]{1, 2, 3},
                new CountTheMonkeys(3).solution()
        );
        assertArrayEquals(
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9},
                new CountTheMonkeys(9).solution()
        );
        assertArrayEquals(
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                new CountTheMonkeys(10).solution()
        );
        assertArrayEquals(
                new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                new CountTheMonkeys(20).solution()
        );
    }

}
