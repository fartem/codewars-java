package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReversedWordsTest {

    @Test
    public void testSomething() {
        assertEquals(
                "eating like I",
                new ReversedWords("I like eating").result()
        );
        assertEquals(
                "flying like I",
                new ReversedWords("I like flying").result()
        );
        assertEquals(
                "nice is world The",
                new ReversedWords("The world is nice").result()
        );
    }

}
