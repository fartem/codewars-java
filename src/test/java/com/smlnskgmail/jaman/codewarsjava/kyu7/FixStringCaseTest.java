package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FixStringCaseTest {

    @Test
    public void BasicTests() {
        assertEquals(
                "code",
                new FixStringCase("code").solution()
        );
        assertEquals(
                "CODE",
                new FixStringCase("CODe").solution()
        );
        assertEquals(
                "code",
                new FixStringCase("COde").solution()
        );
        assertEquals(
                "code",
                new FixStringCase("Code").solution()
        );
        assertEquals(
                "",
                new FixStringCase("").solution()
        );
    }

}
