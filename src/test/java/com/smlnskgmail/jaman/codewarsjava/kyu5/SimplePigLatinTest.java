package com.smlnskgmail.jaman.codewarsjava.kyu5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimplePigLatinTest {

    @Test
    public void FixedTests() {
        assertEquals(
                "igPay atinlay siay oolcay",
                new SimplePigLatin("Pig latin is cool").solution()
        );
        assertEquals(
                "hisTay siay ymay tringsay",
                new SimplePigLatin("This is my string").solution()
        );
    }

}
