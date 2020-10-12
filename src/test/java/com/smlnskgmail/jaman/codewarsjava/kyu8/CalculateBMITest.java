package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateBMITest {

    @Test
    public void testBMI() {
        assertEquals(
                "Normal",
                new CalculateBMI(80, 1.80).solution()
        );
    }

}
