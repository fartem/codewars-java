package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquareEveryDigitTest {

    @Test
    public void test() {
        assertEquals(
                811181,
                new SquareEveryDigit(9119).solution()
        );
    }

}
