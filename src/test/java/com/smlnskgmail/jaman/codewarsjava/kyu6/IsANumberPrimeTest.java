package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsANumberPrimeTest {

    @Test
    public void testBasic() {
        assertFalse(
                new IsANumberPrime(0).solution()
        );
        assertFalse(
                new IsANumberPrime(1).solution()
        );
        assertTrue(
                new IsANumberPrime(2).solution()
        );
        assertTrue(
                new IsANumberPrime(73).solution()
        );
        assertFalse(
                new IsANumberPrime(75).solution()
        );
        assertFalse(
                new IsANumberPrime(-1).solution()
        );
    }

    @Test
    public void testPrime() {
        assertTrue(
                new IsANumberPrime(3).solution()
        );
        assertTrue(
                new IsANumberPrime(5).solution()
        );
        assertTrue(
                new IsANumberPrime(7).solution()
        );
        assertTrue(
                new IsANumberPrime(41).solution()
        );
        assertTrue(
                new IsANumberPrime(5099).solution()
        );
    }

    @Test
    public void testNotPrime() {
        assertFalse(
                new IsANumberPrime(4).solution()
        );
        assertFalse(
                new IsANumberPrime(6).solution()
        );
        assertFalse(
                new IsANumberPrime(8).solution()
        );
        assertFalse(
                new IsANumberPrime(9).solution()
        );
        assertFalse(
                new IsANumberPrime(45).solution()
        );
        assertFalse(
                new IsANumberPrime(-5).solution()
        );
        assertFalse(
                new IsANumberPrime(-8).solution()
        );
        assertFalse(
                new IsANumberPrime(-41).solution()
        );
    }

}
