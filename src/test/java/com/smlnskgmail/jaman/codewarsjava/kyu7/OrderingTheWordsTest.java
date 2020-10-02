package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OrderingTheWordsTest {

    @Test
    public void testHelloWorld() {
        assertEquals(
                " !,HWdellloor",
                new OrderingTheWords("Hello, World!").solution()
        );
    }

    @Test
    public void testCompleteSolution() {
        assertEquals(
                "ceeillmnooopsttu",
                new OrderingTheWords("completesolution").solution()
        );
    }

    @Test
    public void testNonLetters() {
        assertEquals(
                "!\"#$%&(*@[]^",
                new OrderingTheWords("\"][@!#$*(^&%").solution()
        );
    }

    @Test
    public void testLettersAndNot() {
        assertEquals(
                "!\"#$%&(@[]^addilorrwz",
                new OrderingTheWords("i\"d][@z!#$r(^a&world%").solution()
        );
    }

    @Test
    public void testNullEmpty() {
        assertEquals(
                "Invalid String!",
                new OrderingTheWords(null).solution()
        );
        assertEquals(
                "Invalid String!",
                new OrderingTheWords("").solution()
        );
    }

}
