package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class HexToDecimalTest {

    @Test
    public void examples() {
        assertEquals(
                1,
                new HexToDecimal("1").solution()
        );
        assertEquals(
                10,
                new HexToDecimal("a").solution()
        );
        assertEquals(
                16,
                new HexToDecimal("10").solution()
        );
        assertEquals(
                255,
                new HexToDecimal("FF").solution()
        );
        assertEquals(
                -12,
                new HexToDecimal("-C").solution()
        );
    }

}
