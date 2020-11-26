package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReturnNegativeTest {

    @Test
    public void test1() {
        assertEquals(
                -42,
                new ReturnNegative(42).solution()
        );
    }

}
