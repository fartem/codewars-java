package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubtractTheSumTest {

    @Test
    public void basicTest() {
        assertEquals(
                "apple",
                new SubtractTheSum(10).solution()
        );
    }

}
