package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleMultiplicationTest {

    @Test
    public void test1() {
        assertEquals(
                9,
                new SimpleMultiplication(1).solution()
        );
        assertEquals(
                27,
                new SimpleMultiplication(3).solution()
        );
        assertEquals(
                189,
                new SimpleMultiplication(21).solution()
        );
        assertEquals(
                207,
                new SimpleMultiplication(23).solution()
        );
    }

    @Test
    public void test2() {
        assertEquals(
                16,
                new SimpleMultiplication(2).solution()
        );
        assertEquals(
                32,
                new SimpleMultiplication(4).solution()
        );
        assertEquals(
                176,
                new SimpleMultiplication(22).solution()
        );
        assertEquals(
                208,
                new SimpleMultiplication(26).solution()
        );
    }

}
