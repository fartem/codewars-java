package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HowManyTimesDoesItContainTest {

    @Test
    public void exampleTests() {
        assertEquals(
                2,
                new HowManyTimesDoesItContain(
                        "Hello World",
                        'o'
                ).solution()
        );
        assertEquals(
                4,
                new HowManyTimesDoesItContain(
                        "Wait isn't it supposed to be cynical?",
                        'i'
                ).solution()
        );
        assertEquals(
                4,
                new HowManyTimesDoesItContain(
                        "I'm gona be the best code warrior ever dad",
                        'r'
                ).solution()
        );
        assertEquals(
                1,
                new HowManyTimesDoesItContain(
                        "Do you like Harry Potter?",
                        '?'
                ).solution()
        );
    }

}
