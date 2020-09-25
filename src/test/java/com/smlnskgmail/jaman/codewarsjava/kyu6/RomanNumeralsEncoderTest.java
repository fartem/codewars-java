package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanNumeralsEncoderTest {

    @Test
    public void shouldConvertToRoman() {
        assertEquals(
                "solution(1) should equal to I",
                "I",
                new RomanNumeralsEncoder(1).result()
        );
        assertEquals(
                "solution(4) should equal to IV",
                "IV",
                new RomanNumeralsEncoder(4).result()
        );
        assertEquals(
                "solution(6) should equal to VI",
                "VI",
                new RomanNumeralsEncoder(6).result()
        );
    }

}
