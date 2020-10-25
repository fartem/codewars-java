package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfDigitsDigitalRootTest {

    @Test
    public void Test1() {
        assertEquals(
                "Nope!",
                7,
                new SumOfDigitsDigitalRoot(16).solution()
        );
    }

    @Test
    public void Test2() {
        assertEquals(
                "Nope!",
                6,
                new SumOfDigitsDigitalRoot(456).solution()
        );
    }

}
