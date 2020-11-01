package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumWithoutHighestAndLowestNumberTest {

    @Test
    public void BasicTests() {
        assertEquals(
                16,
                new SumWithoutHighestAndLowestNumber(new int[] { 6, 2, 1, 8, 10 }).solution()
        );
    }

}
