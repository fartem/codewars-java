package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class FIXMELetsSplitThisJoinsTest {

    @Test
    public void example() {
        assertEquals(
                new String[] {"a", "b", "c"},
                show(new FIXMELetsSplitThisJoins("a.b.c").solution())
        );
    }

    private static String[] show(final String[] ary) {
        System.out.println(Arrays.toString(ary));
        return ary;
    }

}