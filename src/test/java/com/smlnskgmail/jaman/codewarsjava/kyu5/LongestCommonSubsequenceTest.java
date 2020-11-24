package com.smlnskgmail.jaman.codewarsjava.kyu5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonSubsequenceTest {

    @Test
    public void exampleTests() {
        assertEquals(
                "",
                new LongestCommonSubsequence("a", "b").solution()
        );
        assertEquals(
                "abc",
                new LongestCommonSubsequence("abcdef", "abc").solution()
        );
    }

}
