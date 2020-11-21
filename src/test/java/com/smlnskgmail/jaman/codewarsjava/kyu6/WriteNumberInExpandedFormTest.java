package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WriteNumberInExpandedFormTest {

    @Test
    public void testSomething() {
        assertEquals(
                "10 + 2",
                new WriteNumberInExpandedForm(12).solution()
        );
        assertEquals(
                "40 + 2",
                new WriteNumberInExpandedForm(42).solution()
        );
        assertEquals(
                "70000 + 300 + 4",
                new WriteNumberInExpandedForm(70304).solution()
        );
    }

}
