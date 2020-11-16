package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsNDivisibleByXAndYTest {

    @Test
    public void test1() {
        assertTrue(
                new IsNDivisibleByXAndY(12, 4, 3).solution()
        );
    }

    @Test
    public void test2() {
        assertFalse(
                new IsNDivisibleByXAndY(3, 3, 4).solution()
        );
    }

}
