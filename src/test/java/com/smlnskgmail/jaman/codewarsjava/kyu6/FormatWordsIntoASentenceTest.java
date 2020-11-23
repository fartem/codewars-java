package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FormatWordsIntoASentenceTest {

    @Test
    public void sampleTests() {
        assertEquals(
                "one, two, three and four",
                new FormatWordsIntoASentence(
                        new String[]{"one", "two", "three", "four"}
                ).solution()
        );
        assertEquals(
                "one",
                new FormatWordsIntoASentence(new String[]{"one"}).solution()
        );
        assertEquals(
                "one and three",
                new FormatWordsIntoASentence(new String[]{"one", "", "three"}).solution()
        );
        assertEquals(
                "three",
                new FormatWordsIntoASentence(new String[]{"", "", "three"}).solution()
        );
        assertEquals(
                "one and two",
                new FormatWordsIntoASentence(new String[]{"one", "two", ""}).solution()
        );
        assertEquals(
                "",
                new FormatWordsIntoASentence(new String[]{}).solution()
        );
        assertEquals(
                "",
                new FormatWordsIntoASentence(null).solution()
        );
        assertEquals(
                "",
                new FormatWordsIntoASentence(new String[]{""}).solution()
        );
    }

}
