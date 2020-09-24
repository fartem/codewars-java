package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AlphabeticalAdditionTest {

    @Test
    public void fixedTests() {
        assertEquals(
                "f",
                new AlphabeticalAddition("a", "b", "c").result()
        );
        assertEquals(
                "z",
                new AlphabeticalAddition("z").result()
        );
        assertEquals(
                "c",
                new AlphabeticalAddition("a", "b").result()
        );
        assertEquals(
                "c",
                new AlphabeticalAddition("c").result()
        );
        assertEquals(
                "a",
                new AlphabeticalAddition("z", "a").result()
        );
        assertEquals(
                "d",
                new AlphabeticalAddition("y", "c", "b").result()
        );
        assertEquals(
                "z",
                new AlphabeticalAddition().result()
        );
    }

}
