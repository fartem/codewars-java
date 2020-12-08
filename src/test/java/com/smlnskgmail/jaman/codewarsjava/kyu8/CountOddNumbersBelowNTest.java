package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountOddNumbersBelowNTest {

    @Test
    public void fixedTests() {
        assertEquals(
                7,
                new CountOddNumbersBelowN(15).solution()
        );
        assertEquals(
                7511,
                new CountOddNumbersBelowN(15023).solution()
        );
    }

}
