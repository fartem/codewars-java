package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfOddNumbersTest {

    @Test
    public void test1() {
        assertEquals(
                1,
                new SumOfOddNumbers(1).solution()
        );
        assertEquals(
                74088,
                new SumOfOddNumbers(42).solution()
        );
    }

}
