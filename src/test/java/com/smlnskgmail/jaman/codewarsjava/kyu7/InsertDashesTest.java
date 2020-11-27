package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InsertDashesTest {

    @Test
    public void sampleTests() {
        assertEquals(
                "4547-9-3",
                new InsertDashes(454793).solution()
        );
        assertEquals(
                "123456",
                new InsertDashes(123456).solution()
        );
        assertEquals(
                "1003-567",
                new InsertDashes(1003567).solution()
        );
    }

}
