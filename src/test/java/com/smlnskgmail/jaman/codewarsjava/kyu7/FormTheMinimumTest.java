package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.*;

public class FormTheMinimumTest {

    @Test
    public void testSomething() {
        assertEquals(
                13,
                new FormTheMinimum(new int[] { 1, 3, 1 }).result()
        );
        assertEquals(
                457,
                new FormTheMinimum(new int[] { 4, 7, 5, 7 }).result()
        );
        assertEquals(
                148,
                new FormTheMinimum(new int[] { 4, 8, 1, 4 }).result()
        );
        assertEquals(
                579,
                new FormTheMinimum(new int[] { 5, 7, 9, 5, 7 }).result()
        );
        assertEquals(
                678,
                new FormTheMinimum(new int[] { 6, 7, 8, 7, 6, 6 }).result()
        );
    }

}