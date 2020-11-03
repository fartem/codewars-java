package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunWithListsIndexOfTest {

    @Test
    public void basicTest() {
        assertEquals(
                0,
                new FunWithListsIndexOf(
                        new FunWithListsIndexOf.Node<>(1),
                        1
                ).solution()
        );
    }

}
