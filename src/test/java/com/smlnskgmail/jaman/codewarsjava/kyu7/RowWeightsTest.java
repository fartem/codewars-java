package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class RowWeightsTest {

    @Test
    public void basicTests() {
        assertArrayEquals(
                new int[]{80, 0},
                new RowWeights(new int[]{80}).solution()
        );
        assertArrayEquals(
                new int[]{100, 50},
                new RowWeights(new int[]{100, 50}).solution()
        );
        assertArrayEquals(
                new int[]{120, 140},
                new RowWeights(new int[]{50, 60, 70, 80}).solution()
        );
    }

    @Test
    public void oddVectorLength() {
        assertArrayEquals(
                new int[]{62, 27},
                new RowWeights(new int[]{13, 27, 49}).solution()
        );
        assertArrayEquals(
                new int[]{236, 92},
                new RowWeights(new int[]{70, 58, 75, 34, 91}).solution()
        );
        assertArrayEquals(
                new int[]{211, 164},
                new RowWeights(new int[]{29, 83, 67, 53, 19, 28, 96}).solution()
        );
    }

    @Test
    public void evenVectorLength() {
        assertArrayEquals(
                new int[]{100, 50},
                new RowWeights(new int[]{100, 50}).solution()
        );
        assertArrayEquals(
                new int[]{150, 151},
                new RowWeights(new int[]{100, 51, 50, 100}).solution()
        );
        assertArrayEquals(
                new int[]{207, 235},
                new RowWeights(new int[]{39, 84, 74, 18, 59, 72, 35, 61}).solution()
        );
    }

}
