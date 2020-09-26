package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindNearestSquareNumberTest {

    @Test
    public void basicTests() {
        assertEquals(
                1,
                new FindNearestSquareNumber(1).solution()
        );
        assertEquals(
                1,
                new FindNearestSquareNumber(2).solution()
        );
        assertEquals(
                9,
                new FindNearestSquareNumber(10).solution()
        );
        assertEquals(
                121,
                new FindNearestSquareNumber(111).solution()
        );
        assertEquals(
                10000,
                new FindNearestSquareNumber(9999).solution()
        );
    }

}
