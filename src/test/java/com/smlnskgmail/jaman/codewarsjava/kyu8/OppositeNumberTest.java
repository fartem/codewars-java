package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OppositeNumberTest {

    @Test
    public void tests() {
        assertEquals(
                -1,
                new OppositeNumber(1).solution()
        );
    }

}
