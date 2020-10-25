package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DetectPangramTest {

    @Test
    public void test1() {
        assertTrue(
                new DetectPangram("The quick brown fox jumps over the lazy dog.").solution()
        );
    }

    @Test
    public void test2() {
        assertFalse(
                new DetectPangram("You shall not pass!").solution()
        );
    }

}
