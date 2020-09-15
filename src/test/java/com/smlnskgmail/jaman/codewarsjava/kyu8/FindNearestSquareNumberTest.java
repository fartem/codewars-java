package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindNearestSquareNumberTest {

    @Test
    public void basicTests() {
        assertEquals(
                1,
                new FindNearestSquareNumber(1).result()
        );
        assertEquals(
                1,
                new FindNearestSquareNumber(2).result()
        );
        assertEquals(
                9,
                new FindNearestSquareNumber(10).result()
        );
        assertEquals(
                121,
                new FindNearestSquareNumber(111).result()
        );
        assertEquals(
                10000,
                new FindNearestSquareNumber(9999).result()
        );
    }

}
