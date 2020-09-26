package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CenturyFromYearTest {

    @Test
    public void FixedTests() {
        assertEquals(
                18,
                new CenturyFromYear(1705).solution()
        );
        assertEquals(
                19,
                new CenturyFromYear(1900).solution()
        );
        assertEquals(
                17,
                new CenturyFromYear(1601).solution()
        );
        assertEquals(
                20,
                new CenturyFromYear(2000).solution()
        );
        assertEquals(
                1,
                new CenturyFromYear(89).solution()
        );
    }

}
