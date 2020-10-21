package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertToBinaryTest {

    @Test
    public void testToBinary() {
        assertEquals(
                1,
                new ConvertToBinary(1).solution()
        );
        assertEquals(
                10,
                new ConvertToBinary(2).solution()
        );
        assertEquals(
                11,
                new ConvertToBinary(3).solution()
        );
        assertEquals(
                101,
                new ConvertToBinary(5).solution()
        );
    }

}
