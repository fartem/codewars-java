package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class AlternateCapitalizationTest {

    @Test
    public void basicTests() {
        assertArrayEquals(
                new String[] { "AbCdEf", "aBcDeF" },
                new AlternateCapitalization("abcdef").solution()
        );
        assertArrayEquals(
                new String[] { "CoDeWaRs", "cOdEwArS" },
                new AlternateCapitalization("codewars").solution()
        );
        assertArrayEquals(
                new String[] { "AbRaCaDaBrA", "aBrAcAdAbRa" },
                new AlternateCapitalization("abracadabra").solution()
        );
        assertArrayEquals(
                new String[] { "CoDeWaRrIoRs", "cOdEwArRiOrS" },
                new AlternateCapitalization("codewarriors").solution()
        );
    }

}
