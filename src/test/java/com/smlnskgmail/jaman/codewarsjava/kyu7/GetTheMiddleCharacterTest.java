package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetTheMiddleCharacterTest {

    @Test
    public void evenTests() {
        assertEquals(
                "es",
                new GetTheMiddleCharacter("test").solution()
        );
        assertEquals(
                "dd",
                new GetTheMiddleCharacter("middle").solution()
        );
    }

    @Test
    public void oddTests() {
        assertEquals(
                "t",
                new GetTheMiddleCharacter("testing").solution()
        );
        assertEquals(
                "A",
                new GetTheMiddleCharacter("A").solution()
        );
    }

}
