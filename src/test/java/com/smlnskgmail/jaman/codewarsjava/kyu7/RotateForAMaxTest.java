package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RotateForAMaxTest {

    @Test
    public void test() {
        assertEquals(
                new RotateForAMax(38458215).solution(),
                85821534
        );
        assertEquals(
                new RotateForAMax(195881031).solution(),
                988103115
        );
        assertEquals(
                new RotateForAMax(896219342).solution(),
                962193428
        );
        assertEquals(
                new RotateForAMax(69418307).solution(),
                94183076
        );
    }

}
