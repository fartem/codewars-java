package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InspiringStringsTest {

    @Test
    public void tests() {
        assertEquals(
                "fgh",
                new InspiringStrings("a b c d e fgh").solution()
        );
        assertEquals(
                "three",
                new InspiringStrings("one two three").solution()
        );
        assertEquals(
                "grey",
                new InspiringStrings("red blue grey").solution()
        );
    }

}
