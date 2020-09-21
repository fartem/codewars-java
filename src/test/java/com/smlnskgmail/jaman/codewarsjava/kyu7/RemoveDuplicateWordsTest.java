package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicateWordsTest {

    @Test
    public void basicTests(){
        assertEquals(
                "alpha beta gamma delta",
                new RemoveDuplicateWords(
                        "alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"
                ).result()
        );
        assertEquals(
                "my cat is fat",
                new RemoveDuplicateWords(
                        "my cat is my cat fat"
                ).result()
        );
    }

}
