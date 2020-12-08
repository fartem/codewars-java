package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class LastTest {

    @Test
    public void testList() {
        assertEquals(
                5,
                (int) Last.last(
                        Arrays.asList(1, 2, 3, 4, 5)
                )
        );
    }

    @Test
    public void testString() {
        assertEquals(
                'e',
                Last.last(
                        "abcde"
                )
        );
    }

    @Test
    public void testArgs() {
        assertEquals(
                5,
                (int) Last.last(
                        1, 2, 3, 4, 5
                )
        );
    }

    @Test
    public void testArray() {
        assertEquals(
                5,
                (int) Last.last(
                        new Integer[]{1, 2, 3, 4, 5}
                )
        );
    }

}
