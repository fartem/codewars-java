package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OppositesAttractTest {

    @Test
    public void testOddAndEven() {
        assertTrue(
                new OppositesAttract(1, 4).solution()
        );
    }

    @Test
    public void testEvenAndEven() {
        assertFalse(
                new OppositesAttract(2, 2).solution()
        );
    }

    @Test
    public void testOddAndOdd() {
        assertFalse(
                new OppositesAttract(1, 1).solution()
        );
    }

    @Test
    public void testEvenAndOdd() {
        assertTrue(
                new OppositesAttract(0, 1).solution()
        );
    }

}
