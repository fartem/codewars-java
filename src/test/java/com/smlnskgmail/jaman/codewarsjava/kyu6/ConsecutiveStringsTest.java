package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConsecutiveStringsTest {

    @Test
    public void test() {
        System.out.println("longestConsec Fixed Tests");
        assertEquals(
                new ConsecutiveStrings(
                        new String[]{"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"},
                        2
                ).solution(),
                "abigailtheta"
        );
        assertEquals(
                new ConsecutiveStrings(
                        new String[]{
                                "ejjjjmmtthh",
                                "zxxuueeg",
                                "aanlljrrrxx",
                                "dqqqaaabbb",
                                "oocccffuucccjjjkkkjyyyeehh"
                        },
                        1
                ).solution(),
                "oocccffuucccjjjkkkjyyyeehh"
        );
        assertEquals(
                new ConsecutiveStrings(
                        new String[]{},
                        3
                ).solution(),
                ""
        );
        assertEquals(
                new ConsecutiveStrings(
                        new String[]{
                                "itvayloxrp",
                                "wkppqsztdkmvcuwvereiupccauycnjutlv",
                                "vweqilsfytihvrzlaodfixoyxvyuyvgpck"
                        },
                        2
                ).solution(),
                "wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck"
        );
        assertEquals(
                new ConsecutiveStrings(
                        new String[]{"wlwsasphmxx", "owiaxujylentrklctozmymu", "wpgozvxxiu"},
                        2
                ).solution(),
                "wlwsasphmxxowiaxujylentrklctozmymu"
        );
        assertEquals(
                new ConsecutiveStrings(
                        new String[]{"zone", "abigail", "theta", "form", "libe", "zas"},
                        -2
                ).solution(),
                ""
        );
        assertEquals(
                new ConsecutiveStrings(
                        new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"},
                        3
                ).solution(),
                "ixoyx3452zzzzzzzzzzzz"
        );
        assertEquals(
                new ConsecutiveStrings(
                        new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"},
                        15
                ).solution(),
                ""
        );
        assertEquals(
                new ConsecutiveStrings(
                        new String[]{"it", "wkppv", "ixoyx", "3452", "zzzzzzzzzzzz"},
                        0
                ).solution(),
                ""
        );
    }

}
