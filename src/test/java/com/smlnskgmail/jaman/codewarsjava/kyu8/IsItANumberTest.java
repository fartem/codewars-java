package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsItANumberTest {

    @Test
    public void test0() {
        assertFalse(
                new IsItANumber("s2324").solution()
        );
    }

    @Test
    public void test1() {
        assertTrue(
                new IsItANumber("-234.4").solution()
        );
    }

}
