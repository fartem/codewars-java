package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class PasswordMakerTest {

    @Test
    public void testUpperOnly() {
        assertNotNull(
                new PasswordMaker(
                        5,
                        true,
                        false,
                        false
                ).solution()
        );
    }

    @Test
    public void testLowerOnly() {
        assertNotNull(
                new PasswordMaker(
                        5,
                        false,
                        true,
                        false
                ).solution()
        );
    }

    @Test
    public void testDigitsOnly() {
        assertNotNull(
                new PasswordMaker(
                        5,
                        false,
                        false,
                        true
                ).solution()
        );
    }

}
