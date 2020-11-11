package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StopGninnipsMySdrowTest {

    @Test
    public void test() {
        assertEquals(
                "emocleW",
                new StopGninnipsMySdrow("Welcome").solution()
        );
        assertEquals(
                "Hey wollef sroirraw",
                new StopGninnipsMySdrow("Hey fellow warriors").solution()
        );
    }

}
