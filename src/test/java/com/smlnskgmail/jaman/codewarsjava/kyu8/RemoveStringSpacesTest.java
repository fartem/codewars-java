package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveStringSpacesTest {

    @Test
    public void testSomething() {
        assertEquals(
                "8j8mBliB8gimjB8B8jlB",
                new RemoveStringSpaces("8 j 8   mBliB8g  imjB8B8  jl  B").solution()
        );
        assertEquals(
                "88Bifk8hB8BB8BBBB888chl8BhBfd",
                new RemoveStringSpaces("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd").solution()
        );
        assertEquals(
                "8aaaaaddddr",
                new RemoveStringSpaces("8aaaaa dddd r     ").solution()
        );
        assertEquals(
                "jfBmgklf8hg88lbe8",
                new RemoveStringSpaces("jfBm  gk lf8hg  88lbe8 ").solution()
        );
        assertEquals(
                "8jaam",
                new RemoveStringSpaces("8j aam").solution()
        );
    }

}
