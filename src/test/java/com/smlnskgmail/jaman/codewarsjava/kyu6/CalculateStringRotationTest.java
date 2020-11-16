package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculateStringRotationTest {

    @Test
    public void test() {
        assertEquals(
                -1,
                new CalculateStringRotation("hoop", "pooh").solution()
        );
        assertEquals(
                2,
                new CalculateStringRotation("coffee", "eecoff").solution()
        );
        assertEquals(
                4,
                new CalculateStringRotation("eecoff", "coffee").solution()
        );
    }

}
