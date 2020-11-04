package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FunWithListsLengthTest {

    @Test
    public void basicTest() {
        assertEquals(
                1,
                new FunWithListsLength(
                        new FunWithListsLength.Node<>(1)
                ).solution()
        );
    }

}
