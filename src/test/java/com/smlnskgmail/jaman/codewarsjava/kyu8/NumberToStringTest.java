package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberToStringTest {

    @Test
    public void tests() {
        assertEquals(
                "123",
                new NumberToString(123).solution()
        );
    }

}
