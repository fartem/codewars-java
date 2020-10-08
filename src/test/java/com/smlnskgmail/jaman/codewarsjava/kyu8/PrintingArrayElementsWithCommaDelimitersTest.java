package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrintingArrayElementsWithCommaDelimitersTest {

    @Test
    public void testInteger() {
        assertEquals(
                "2,4,5,2",
                new PrintingArrayElementsWithCommaDelimiters(
                        new Integer[] { 2, 4, 5, 2 }
                ).solution()
        );
    }

}
