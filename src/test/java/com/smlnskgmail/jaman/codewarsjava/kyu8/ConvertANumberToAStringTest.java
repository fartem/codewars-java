package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertANumberToAStringTest {

    @Test
    public void tests() {
        assertEquals(
                "67",
                new ConvertANumberToAString(67).solution()
        );
        assertEquals(
                "123",
                new ConvertANumberToAString(123).solution()
        );
        assertEquals(
                "999",
                new ConvertANumberToAString(999).solution()
        );
    }

}
