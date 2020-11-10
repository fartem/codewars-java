package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FIXMEGetFullNameTest {

    @Test
    public void test() {
        assertEquals(
                "Clint Eastwood",
                new FIXMEGetFullName("Clint", "Eastwood").getFullName()
        );
    }

}
