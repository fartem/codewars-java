package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CWarsTest {

    @Test
    public void testExamples() {
        assertEquals(
                "C.Wars",
                new CWars("code wars").solution()
        );
        assertEquals(
                "B.H.Obama",
                new CWars("Barack hussain obama").solution()
        );
        assertEquals(
                "B.H.Obama",
                new CWars("barrack hussain Obama").solution()
        );
    }

}
