package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsValidIdentifierTest {

    @Test
    public void testValid() {
        assertTrue(new IsValidIdentifier("i1").solution());
    }

    @Test
    public void testInvalid() {
        assertFalse(new IsValidIdentifier("1i").solution());
    }

}
