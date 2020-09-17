package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class RowWeightsTest {

    @Test
    public void basicTests() {
        assertArrayEquals(
                new int[] { 80, 0 },
                new RowWeights(new int[] { 80 }).result()
        );
        assertArrayEquals(
                new int[] { 100, 50 },
                new RowWeights(new int[] { 100, 50 }).result()
        );
        assertArrayEquals(
                new int[] { 120, 140 },
                new RowWeights(new int[] { 50, 60, 70, 80 }).result()
        );
    }

    @Test
    public void oddVectorLength() {
        assertArrayEquals(
                new int[] { 62, 27 },
                new RowWeights(new int[] { 13, 27, 49 }).result()
        );
        assertArrayEquals(
                new int[] { 236, 92 },
                new RowWeights(new int[] { 70, 58, 75, 34, 91 }).result()
        );
        assertArrayEquals(
                new int[] { 211, 164 },
                new RowWeights(new int[] { 29, 83, 67, 53, 19, 28, 96 }).result()
        );
    }

    @Test
    public void evenVectorLength() {
        assertArrayEquals(
                new int[] {100, 50},
                new RowWeights(new int[] { 100, 50 }).result()
        );
        assertArrayEquals(
                new int[] {150, 151},
                new RowWeights(new int[] { 100, 51, 50, 100 }).result()
        );
        assertArrayEquals(
                new int[] {207, 235},
                new RowWeights(new int[] { 39, 84, 74, 18, 59, 72, 35, 61 }).result()
        );
    }

}