package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FormTheLargestTest {

    @Test
    public void passBasicTests() {
        assertEquals(
                321,
                new FormTheLargest(213).result()
        );
        assertEquals(
                9873,
                new FormTheLargest(7389).result()
        );
        assertEquals(
                97632,
                new FormTheLargest(63792).result()
        );
    }

    @Test
    public void passDigitOccurrenceRepeation() {
        assertEquals(
                977665,
                new FormTheLargest(566797).result()
        );
        assertEquals(
                9987332,
                new FormTheLargest(2399783).result()
        );
        assertEquals(
                99997777,
                new FormTheLargest(79797979).result()
        );
    }

    @Test
    public void passLargeNumbers() {
        assertEquals(
                98764321,
                new FormTheLargest(17693284).result()
        );
        assertEquals(
                98776531,
                new FormTheLargest(17758936).result()
        );
        assertEquals(
                987665431,
                new FormTheLargest(134976658).result()
        );
    }

}
