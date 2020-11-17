package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FIXMELetsSplitThisJoinsTest {

    @Test
    public void example() {
        assertArrayEquals(
                new String[]{"a", "b", "c"},
                new FIXMELetsSplitThisJoins("a.b.c").solution()
        );
    }

}
