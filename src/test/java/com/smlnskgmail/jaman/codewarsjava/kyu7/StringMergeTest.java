package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringMergeTest {

    @Test
    public void test1() {
        assertEquals(
                "pere",
                new StringMerge("person", "here", 'e').solution()
        );
    }

    @Test
    public void test2() {
        assertEquals(
                "apowiejouh",
                new StringMerge("apowiejfoiajsf", "iwahfeijouh", 'j').solution()
        );
    }

    @Test
    public void test3() {
        assertEquals(
                "abcdefxxxyyyxyzz",
                new StringMerge("abcdefxxxyzz", "abcxxxyyyxyzz", 'x').solution()
        );
    }

}
