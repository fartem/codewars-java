package com.smlnskgmail.jaman.codewarsjava.kyu5;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MergedStringCheckerTest {

    @Test
    public void normalHappyFlow() {
        assertTrue(
                "codewars can be created from code and wars",
                new MergedStringChecker("codewars", "code", "wars").solution()
        );
        assertTrue(
                "codewars can be created from cdwr and oeas",
                new MergedStringChecker("codewars", "cdwr", "oeas").solution()
        );
        assertFalse(
                "Codewars are not codwars",
                new MergedStringChecker("codewars", "cod", "wars").solution()
        );
    }

}
