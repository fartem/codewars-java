package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FixStringCaseTest {

    @Test
    public void BasicTests() {
        assertEquals(
                "code",
                new FixStringCase("code").result()
        );
        assertEquals(
                "CODE",
                new FixStringCase("CODe").result()
        );
        assertEquals(
                "code",
                new FixStringCase("COde").result()
        );
        assertEquals(
                "code",
                new FixStringCase("Code").result()
        );
        assertEquals(
                "",
                new FixStringCase("").result()
        );
    }

}