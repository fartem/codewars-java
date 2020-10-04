package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RegexValidatePINCodeTest {

    @Test
    public void validPins() {
        assertTrue(new RegexValidatePINCode("1234").solution());
        assertTrue(new RegexValidatePINCode("0000").solution());
        assertTrue(new RegexValidatePINCode("1111").solution());
        assertTrue(new RegexValidatePINCode("123456").solution());
        assertTrue(new RegexValidatePINCode("098765").solution());
        assertTrue(new RegexValidatePINCode("000000").solution());
        assertTrue(new RegexValidatePINCode("090909").solution());
    }

    @Test
    public void nonDigitCharacters() {
        assertFalse(new RegexValidatePINCode("a234").solution());
        assertFalse(new RegexValidatePINCode(".234").solution());
    }

    @Test
    public void invalidLengths() {
        assertFalse(new RegexValidatePINCode("1").solution());
        assertFalse(new RegexValidatePINCode("12").solution());
        assertFalse(new RegexValidatePINCode("123").solution());
        assertFalse(new RegexValidatePINCode("12345").solution());
        assertFalse(new RegexValidatePINCode("1234567").solution());
        assertFalse(new RegexValidatePINCode("-1234").solution());
        assertFalse(new RegexValidatePINCode("1.234").solution());
        assertFalse(new RegexValidatePINCode("00000000").solution());
    }

}
