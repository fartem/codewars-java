package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChangeCaseTest {

    @Test
    public void changeIt() {
        assertEquals(
                "Hello world",
                new ChangeCase("Hello World").toSentenceCase()
        );
        assertEquals(
                "hello world",
                new ChangeCase("Hello World").toLowerCase()
        );
        assertEquals(
                "HELLO WORLD",
                new ChangeCase("Hello World").toUpperCase()
        );
        assertEquals(
                "Hello World",
                new ChangeCase("Hello World").capitalizeEachWord()
        );
        assertEquals(
                "hELLO wORLD",
                new ChangeCase("Hello World").toToggleCase()
        );
    }

}
