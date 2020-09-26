package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SimpleStringIndicesTest {

    @Test
    public void testSomething() {
        assertEquals(
                10,
                new SimpleStringIndices("((1)23(45))(aB)", 0).solution()
        );
        assertEquals(
                3,
                new SimpleStringIndices("((1)23(45))(aB)", 1).solution()
        );
        assertEquals(
                -1,
                new SimpleStringIndices("((1)23(45))(aB)", 2).solution()
        );
        assertEquals(
                9,
                new SimpleStringIndices("((1)23(45))(aB)", 6).solution()
        );
        assertEquals(
                14,
                new SimpleStringIndices("((1)23(45))(aB)", 11).solution()
        );
        assertEquals(
                28,
                new SimpleStringIndices("(g(At)IO(f)(tM(qk)YF(n)Nr(E)))", 11).solution()
        );
        assertEquals(
                29,
                new SimpleStringIndices("(g(At)IO(f)(tM(qk)YF(n)Nr(E)))", 0).solution()
        );
        assertEquals(
                22,
                new SimpleStringIndices("(>_(va)`?(h)C(as)(x(hD)P|(fg)))", 19).solution()
        );
    }

}