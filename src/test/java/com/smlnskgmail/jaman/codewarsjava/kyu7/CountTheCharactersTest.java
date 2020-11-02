package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountTheCharactersTest {

    @Test
    public void testSomething() {
        assertEquals(
                4,
                new CountTheCharacters("fizzbuzz", 'z').solution()
        );
        assertEquals(
                4,
                new CountTheCharacters("FIZZBUZZ", 'z').solution()
        );
    }

}
