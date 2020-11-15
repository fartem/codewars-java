package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReversedSequenceTest {

    @Test
    public void simpleTest() {
        assertArrayEquals(
                new int[]{5, 4, 3, 2, 1},
                new ReversedSequence(5).solution()
        );
    }

}
