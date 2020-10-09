package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class altERnaTIngcAsEALTerNAtiNGCaSeTest {

    @Test
    public void fixedTests() {
        assertEquals(
                "HELLO WORLD",
                new altERnaTIngcAsEALTerNAtiNGCaSe("hello world").solution()
        );
        assertEquals(
                "hello world",
                new altERnaTIngcAsEALTerNAtiNGCaSe("HELLO WORLD").solution()
        );
        assertEquals(
                "HELLO world",
                new altERnaTIngcAsEALTerNAtiNGCaSe("hello WORLD").solution()
        );
        assertEquals(
                "hEllO wOrld",
                new altERnaTIngcAsEALTerNAtiNGCaSe("HeLLo WoRLD").solution()
        );
        assertEquals(
                "Hello World",
                new altERnaTIngcAsEALTerNAtiNGCaSe(
                        new altERnaTIngcAsEALTerNAtiNGCaSe("Hello World").solution()
                ).solution()
        );
        assertEquals(
                "12345",
                new altERnaTIngcAsEALTerNAtiNGCaSe("12345").solution()
        );
        assertEquals(
                "1A2B3C4D5E",
                new altERnaTIngcAsEALTerNAtiNGCaSe("1a2b3c4d5e").solution()
        );
        assertEquals(
                "sTRINGuTILS.TOaLTERNATINGcASE",
                new altERnaTIngcAsEALTerNAtiNGCaSe("StringUtils.toAlternatingCase").solution()
        );
    }

    @Test
    public void kataTitleTests() {
        assertEquals(
                "ALTerNAtiNG CaSe",
                new altERnaTIngcAsEALTerNAtiNGCaSe("altERnaTIng cAsE").solution()
        );
        assertEquals(
                "altERnaTIng cAsE",
                new altERnaTIngcAsEALTerNAtiNGCaSe("ALTerNAtiNG CaSe").solution()
        );
        assertEquals(
                "ALTerNAtiNG CaSe <=> altERnaTIng cAsE",
                new altERnaTIngcAsEALTerNAtiNGCaSe("altERnaTIng cAsE <=> ALTerNAtiNG CaSe").solution()
        );
        assertEquals(
                "altERnaTIng cAsE <=> ALTerNAtiNG CaSe",
                new altERnaTIngcAsEALTerNAtiNGCaSe("ALTerNAtiNG CaSe <=> altERnaTIng cAsE").solution()
        );
    }

}
