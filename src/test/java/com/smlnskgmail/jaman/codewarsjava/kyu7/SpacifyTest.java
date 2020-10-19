package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpacifyTest {

    @Test
    public void basicTest() {
        assertEquals(
                "h e l l o   w o r l d",
                new Spacify("hello world").solution()
        );
        assertEquals(
                "1 2 3 4 5",
                new Spacify("12345").solution()
        );
    }

}
