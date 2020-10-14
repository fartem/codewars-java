package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShortestWordTest {

    @Test
    public void findShort() {
        assertEquals(
                3,
                new ShortestWord("bitcoin take over the world maybe who knows perhaps").solution()
        );
        assertEquals(
                3,
                new ShortestWord("turns out random test cases are easier than writing out basic ones").solution()
        );
    }

}
