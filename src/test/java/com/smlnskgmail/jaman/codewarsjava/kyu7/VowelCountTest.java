package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VowelCountTest {

    @Test
    public void testCase1() {
        assertEquals(
                "Nope!",
                5,
                new VowelCount("abracadabra").solution()
        );
    }

}
