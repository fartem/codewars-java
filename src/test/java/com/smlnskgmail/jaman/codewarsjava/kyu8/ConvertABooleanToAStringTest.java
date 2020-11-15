package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertABooleanToAStringTest {

    @Test
    public void testTrue() {
        assertEquals(
                new ConvertABooleanToAString(true).solution(),
                "true"
        );
    }

    @Test
    public void testFalse() {
        assertEquals(
                new ConvertABooleanToAString(false).solution(),
                "false"
        );
    }

}
