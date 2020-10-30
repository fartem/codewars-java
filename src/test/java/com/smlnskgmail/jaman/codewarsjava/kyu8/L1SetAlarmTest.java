package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class L1SetAlarmTest {

    @Test
    public void setAlarmTest() {
        assertTrue(
                "Should be true.",
                new L1SetAlarm(true, false).solution()
        );
        assertFalse(
                "Should be false.",
                new L1SetAlarm(true, true).solution()
        );
        assertFalse(
                "Should be false.",
                new L1SetAlarm(false, false).solution()
        );
        assertFalse(
                "Should be false.",
                new L1SetAlarm(false, true).solution()
        );
    }

}
