package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FormTheLargestTest {

    @Test
    public void passBasicTests() {
        assertEquals(
                321,
                new FormTheLargest(213).solution()
        );
        assertEquals(
                9873,
                new FormTheLargest(7389).solution()
        );
        assertEquals(
                97632,
                new FormTheLargest(63792).solution()
        );
    }

    @Test
    public void passDigitOccurrenceRepeation() {
        assertEquals(
                977665,
                new FormTheLargest(566797).solution()
        );
        assertEquals(
                9987332,
                new FormTheLargest(2399783).solution()
        );
        assertEquals(
                99997777,
                new FormTheLargest(79797979).solution()
        );
    }

    @Test
    public void passLargeNumbers() {
        assertEquals(
                98764321,
                new FormTheLargest(17693284).solution()
        );
        assertEquals(
                98776531,
                new FormTheLargest(17758936).solution()
        );
        assertEquals(
                987665431,
                new FormTheLargest(134976658).solution()
        );
    }

}
