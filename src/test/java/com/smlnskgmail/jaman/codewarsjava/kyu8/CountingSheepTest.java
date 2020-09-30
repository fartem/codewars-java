package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CountingSheepTest {

    @Test
    public void test() {
        assertEquals(
                "There are 17 sheeps in total",
                17,
                new CountingSheep(
                        new Boolean[] {
                                true, true, true, false,
                                true, true, true, true,
                                true, false, true, false,
                                true, false, false, true,
                                true, true, true, true,
                                false, false, true, true
                        }
                ).solution()
        );
    }

}
