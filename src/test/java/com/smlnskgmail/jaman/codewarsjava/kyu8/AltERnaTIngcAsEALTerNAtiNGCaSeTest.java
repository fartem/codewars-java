package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AltERnaTIngcAsEALTerNAtiNGCaSeTest {

    @Test
    public void fixedTests() {
        assertEquals(
                "HELLO WORLD",
                new AltERnaTIngcAsEALTerNAtiNGCaSe("hello world").solution()
        );
        assertEquals(
                "hello world",
                new AltERnaTIngcAsEALTerNAtiNGCaSe("HELLO WORLD").solution()
        );
        assertEquals(
                "HELLO world",
                new AltERnaTIngcAsEALTerNAtiNGCaSe("hello WORLD").solution()
        );
        assertEquals(
                "hEllO wOrld",
                new AltERnaTIngcAsEALTerNAtiNGCaSe("HeLLo WoRLD").solution()
        );
        assertEquals(
                "Hello World",
                new AltERnaTIngcAsEALTerNAtiNGCaSe(
                        new AltERnaTIngcAsEALTerNAtiNGCaSe("Hello World").solution()
                ).solution()
        );
        assertEquals(
                "12345",
                new AltERnaTIngcAsEALTerNAtiNGCaSe("12345").solution()
        );
        assertEquals(
                "1A2B3C4D5E",
                new AltERnaTIngcAsEALTerNAtiNGCaSe("1a2b3c4d5e").solution()
        );
        assertEquals(
                "sTRINGuTILS.TOaLTERNATINGcASE",
                new AltERnaTIngcAsEALTerNAtiNGCaSe("StringUtils.toAlternatingCase").solution()
        );
    }

    @Test
    public void kataTitleTests() {
        assertEquals(
                "ALTerNAtiNG CaSe",
                new AltERnaTIngcAsEALTerNAtiNGCaSe("altERnaTIng cAsE").solution()
        );
        assertEquals(
                "altERnaTIng cAsE",
                new AltERnaTIngcAsEALTerNAtiNGCaSe("ALTerNAtiNG CaSe").solution()
        );
        assertEquals(
                "ALTerNAtiNG CaSe <=> altERnaTIng cAsE",
                new AltERnaTIngcAsEALTerNAtiNGCaSe("altERnaTIng cAsE <=> ALTerNAtiNG CaSe").solution()
        );
        assertEquals(
                "altERnaTIng cAsE <=> ALTerNAtiNG CaSe",
                new AltERnaTIngcAsEALTerNAtiNGCaSe("ALTerNAtiNG CaSe <=> altERnaTIng cAsE").solution()
        );
    }

}
