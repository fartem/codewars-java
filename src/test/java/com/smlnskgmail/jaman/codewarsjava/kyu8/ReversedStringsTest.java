package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReversedStringsTest {

    @Test
    public void sampleTests() {
        assertEquals(
                "dlrow",
                new ReversedStrings("world").solution()
        );
    }

}
