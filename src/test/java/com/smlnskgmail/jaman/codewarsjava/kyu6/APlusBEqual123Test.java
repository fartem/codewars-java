package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class APlusBEqual123Test {

    @Test
    public void testLess() {
        assertEquals(
                123,
                (int) new APlusBEqual123(0).solution()
        );
    }

    @Test
    public void testSame() {
        assertEquals(
                123,
                (int) (new APlusBEqual123(123).solution() + 123)
        );
    }

    @Test
    public void testGreater() {
        assertEquals(
                123,
                (int) (new APlusBEqual123(500).solution() + 500)
        );
    }

}
