package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DNAToRNAConversionTest {

    @Test
    public void testDna() {
        assertEquals(
                "UUUU",
                new DNAToRNAConversion("TTTT").solution()
        );
    }

    @Test
    public void testDna2() {
        assertEquals(
                "GCAU",
                new DNAToRNAConversion("GCAT").solution()
        );
    }

}
