package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParseNiceIntFromCharProblemTest {

    @Test
    public void test1() {
        assertEquals(
                5,
                new ParseNiceIntFromCharProblem("5 years old").solution()
        );
    }

    @Test
    public void test2() {
        assertEquals(
                9,
                new ParseNiceIntFromCharProblem("9 years old").solution()
        );
    }

    @Test
    public void test3() {
        assertEquals(
                1,
                new ParseNiceIntFromCharProblem("1 year old").solution()
        );
    }

}
