package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChangingLettersTest {

    @Test
    public void swap1() {
        assertEquals(
                "HEllOWOrld!",
                new ChangingLetters("HelloWorld!").solution()
        );
    }

    @Test
    public void swap2() {
        assertEquals(
                "SUndAy",
                new ChangingLetters("Sunday").solution()
        );
    }

}
