package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlphabeticalAdditionTest {

    @Test
    public void fixedTests() {
        assertEquals(
                "f",
                new AlphabeticalAddition("a", "b", "c").solution()
        );
        assertEquals(
                "z",
                new AlphabeticalAddition("z").solution()
        );
        assertEquals(
                "c",
                new AlphabeticalAddition("a", "b").solution()
        );
        assertEquals(
                "c",
                new AlphabeticalAddition("c").solution()
        );
        assertEquals(
                "a",
                new AlphabeticalAddition("z", "a").solution()
        );
        assertEquals(
                "d",
                new AlphabeticalAddition("y", "c", "b").solution()
        );
        assertEquals(
                "z",
                new AlphabeticalAddition().solution()
        );
    }

}
