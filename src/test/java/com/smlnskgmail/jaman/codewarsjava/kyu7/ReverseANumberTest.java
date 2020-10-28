package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseANumberTest {

    @Test
    public void reverse() {
        assertEquals(
                321,
                new ReverseANumber(123).solution()
        );
        assertEquals(
                -321,
                new ReverseANumber(-123).solution()
        );
        assertEquals(
                1,
                new ReverseANumber(1000).solution()
        );
        assertEquals(
                4321234,
                new ReverseANumber(4321234).solution()
        );
        assertEquals(
                5,
                new ReverseANumber(5).solution()
        );
        assertEquals(
                89898989,
                new ReverseANumber(98989898).solution()
        );
    }

}
