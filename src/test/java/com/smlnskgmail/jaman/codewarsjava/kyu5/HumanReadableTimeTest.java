package com.smlnskgmail.jaman.codewarsjava.kyu5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanReadableTimeTest {

    @Test
    public void Tests() {
        assertEquals(
                "00:00:00",
                new HumanReadableTime(0).solution()
        );
        assertEquals(
                "00:00:05",
                new HumanReadableTime(5).solution()
        );
        assertEquals(
                "00:01:00",
                new HumanReadableTime(60).solution()
        );
        assertEquals(
                "23:59:59",
                new HumanReadableTime(86399).solution()
        );
        assertEquals(
                "99:59:59",
                new HumanReadableTime(359999).solution()
        );
    }

}
