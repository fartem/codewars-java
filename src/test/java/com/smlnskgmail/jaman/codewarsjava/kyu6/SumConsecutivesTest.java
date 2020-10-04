package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SumConsecutivesTest {

    @Test
    public void test() {
        assertEquals(
                Arrays.asList(1, 12, 0, 4, 6, 1),
                new SumConsecutives(
                        Arrays.asList(1, 4, 4, 4, 0, 4, 3, 3, 1)
                ).solution()
        );
        assertEquals(
                Arrays.asList(-10, 14, 12, 0),
                new SumConsecutives(
                        Arrays.asList(-5, -5, 7, 7, 12, 0)
                ).solution()
        );
    }

}
