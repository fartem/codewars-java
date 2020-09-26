package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrimorialOfANumberTest {

    @Test
    public void checkSmallValues() {
        assertEquals(
                "30",
                new PrimorialOfANumber(3).solution()
        );
        assertEquals(
                "210",
                new PrimorialOfANumber(4).solution()
        );
        assertEquals(
                "2310",
                new PrimorialOfANumber(5).solution()
        );
    }

    @Test
    public void checkLargerValues() {
        assertEquals(
                "9699690",
                new PrimorialOfANumber(8).solution()
        );
        assertEquals(
                "223092870",
                new PrimorialOfANumber(9).solution()
        );
    }

}