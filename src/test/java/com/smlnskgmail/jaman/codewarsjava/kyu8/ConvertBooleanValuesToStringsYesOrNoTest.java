package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConvertBooleanValuesToStringsYesOrNoTest {

    @Test
    public void testBoolToWord() {
        assertEquals(
                "Yes",
                new ConvertBooleanValuesToStringsYesOrNo(true).solution()
        );
        assertEquals(
                "No",
                new ConvertBooleanValuesToStringsYesOrNo(false).solution()
        );
    }

}
