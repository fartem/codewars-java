package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhoLikesItTest {

    @Test
    public void staticTests() {
        assertEquals(
                "no one likes this",
                new WhoLikesIt().solution()
        );
        assertEquals(
                "Peter likes this",
                new WhoLikesIt("Peter").solution()
        );
        assertEquals(
                "Jacob and Alex like this",
                new WhoLikesIt("Jacob", "Alex").solution()
        );
        assertEquals(
                "Max, John and Mark like this",
                new WhoLikesIt("Max", "John", "Mark").solution()
        );
        assertEquals(
                "Alex, Jacob and 2 others like this",
                new WhoLikesIt("Alex", "Jacob", "Mark", "Max").solution()
        );
    }

}
