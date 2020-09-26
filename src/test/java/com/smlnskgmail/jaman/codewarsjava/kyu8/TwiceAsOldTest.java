package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwiceAsOldTest {

    @Test
    public void testSomething() {
        assertEquals(
                30,
                new TwiceAsOld(30, 0).solution()
        );
        assertEquals(
                16,
                new TwiceAsOld(30, 7).solution()
        );
        assertEquals(
                15,
                new TwiceAsOld(45, 30).solution()
        );
    }

}
