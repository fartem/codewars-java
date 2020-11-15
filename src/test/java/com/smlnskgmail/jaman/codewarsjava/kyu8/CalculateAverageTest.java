package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateAverageTest {

    private static final double DELTA = 1e-15;

    @Test
    public void testSomething() {
        assertEquals(
                1,
                new CalculateAverage(new int[]{1, 1, 1}).solution(),
                DELTA
        );
        assertEquals(
                2,
                new CalculateAverage(new int[]{1, 2, 3}).solution(),
                DELTA
        );
    }

}
