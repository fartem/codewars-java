package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindAllPairsTest {

    @Test
    public void simpleTests() {
        int[] array = { 1, 2, 5, 6, 5, 2 };
        int numOfPairs = 2;
        assertEquals(
                numOfPairs,
                new FindAllPairs(array).solution()
        );

        array = new int[] { 1, 2, 2, 20, 6, 20, 2, 6, 2 };
        numOfPairs = 4;
        assertEquals(
                numOfPairs,
                new FindAllPairs(array).solution()
        );

        array = new int[] { 0, 0, 0, 0, 0, 0, 0 };
        numOfPairs = 3;
        assertEquals(
                numOfPairs,
                new FindAllPairs(array).solution()
        );

        array = new int[] { 1000, 1000 };
        numOfPairs = 1;
        assertEquals(
                numOfPairs,
                new FindAllPairs(array).solution()
        );

        array = new int[] {};
        numOfPairs = 0;
        assertEquals(
                numOfPairs,
                new FindAllPairs(array).solution()
        );

        array = new int[] { 54 };
        numOfPairs = 0;
        assertEquals(
                numOfPairs,
                new FindAllPairs(array).solution()
        );
    }

}
