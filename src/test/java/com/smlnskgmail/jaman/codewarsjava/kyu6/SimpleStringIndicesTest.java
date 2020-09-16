package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleStringIndicesTest {

    @Test
    public void testSomething() {
        assertEquals(
                10,
                new SimpleStringIndices("((1)23(45))(aB)", 0).result()
        );
        assertEquals(
                3,
                new SimpleStringIndices("((1)23(45))(aB)", 1).result()
        );
        assertEquals(
                -1,
                new SimpleStringIndices("((1)23(45))(aB)", 2).result()
        );
        assertEquals(
                9,
                new SimpleStringIndices("((1)23(45))(aB)", 6).result()
        );
        assertEquals(
                14,
                new SimpleStringIndices("((1)23(45))(aB)", 11).result()
        );
        assertEquals(
                28,
                new SimpleStringIndices("(g(At)IO(f)(tM(qk)YF(n)Nr(E)))", 11).result()
        );
        assertEquals(
                29,
                new SimpleStringIndices("(g(At)IO(f)(tM(qk)YF(n)Nr(E)))", 0).result()
        );
        assertEquals(
                22,
                new SimpleStringIndices("(>_(va)`?(h)C(as)(x(hD)P|(fg)))", 19).result()
        );
    }

}