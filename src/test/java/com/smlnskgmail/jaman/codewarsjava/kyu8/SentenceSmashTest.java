package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SentenceSmashTest {

    @Test
    public void validate() {
        assertEquals(
                "Bilal Djaghout",
                new SentenceSmash(new String[]{"Bilal", "Djaghout"}).solution()
        );
    }

    @Test
    public void validateEmpty() {
        assertEquals(
                "",
                new SentenceSmash(new String[]{}).solution()
        );
    }

    @Test
    public void validateOneWord() {
        assertEquals(
                "Bilal",
                new SentenceSmash(new String[]{"Bilal"}).solution()
        );
    }

}
