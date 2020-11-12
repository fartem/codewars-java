package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidBracesTest {

    @Test
    public void testValid() {
        assertTrue(new ValidBraces("()").solution());
    }

    @Test
    public void testInvalid() {
        assertFalse(new ValidBraces("[(])").solution());
    }

}
