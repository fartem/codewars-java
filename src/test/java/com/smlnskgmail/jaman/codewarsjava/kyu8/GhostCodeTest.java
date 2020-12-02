package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GhostCodeTest {

    @Test
    public void exampleTests() {
        assertEquals(
                "Hello my name is Javatlacati",
                new GhostCode("Javatlacati").solution()
        );
    }

}
