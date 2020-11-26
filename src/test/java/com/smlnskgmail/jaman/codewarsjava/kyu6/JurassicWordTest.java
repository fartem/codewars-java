package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JurassicWordTest {

    @Test
    public void test1() {
        assertEquals(
                "A T-Rex is eating a dead dino.",
                new JurassicWord("_CVvvvVC}>").solution()
        );
    }

    @Test
    public void test2() {
        assertEquals(
                "A triceratops is eating flowers.",
                new JurassicWord("iiiuuVuuiii").solution()
        );
    }

    @Test
    public void test3() {
        assertEquals(
                "Something is eating leaves.",
                new JurassicWord("|||uuVuu|||").solution()
        );
    }

}
