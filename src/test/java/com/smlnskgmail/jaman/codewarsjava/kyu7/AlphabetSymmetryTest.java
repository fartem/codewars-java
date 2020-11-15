package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class AlphabetSymmetryTest {

    @Test
    public void sampleTest() {
        assertArrayEquals(
                new int[]{4, 3, 1},
                new AlphabetSymmetry(
                        new String[]{"abode", "ABc", "xyzD"}
                ).solution()
        );
        assertArrayEquals(
                new int[]{4, 3, 0},
                new AlphabetSymmetry(
                        new String[]{"abide", "ABc", "xyz"}
                ).solution()
        );
        assertArrayEquals(
                new int[]{6, 5, 7},
                new AlphabetSymmetry(
                        new String[]{"IAMDEFANDJKL", "thedefgh", "xyzDEFghijabc"}
                ).solution()
        );
        assertArrayEquals(
                new int[]{1, 3, 1, 3},
                new AlphabetSymmetry(
                        new String[]{"encode", "abc", "xyzD", "ABmD"}
                ).solution()
        );
    }

}
