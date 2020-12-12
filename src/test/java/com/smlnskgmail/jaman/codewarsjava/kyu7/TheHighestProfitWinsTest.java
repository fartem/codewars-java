package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertArrayEquals;

public class TheHighestProfitWinsTest {

    private Random rand;

    @Before
    public void initTest() {
        rand = new Random();
    }

    @Test
    public void testExampleCases() {
        assertArrayEquals(
                new int[]{1, 5},
                new TheHighestProfitWins(
                        new int[]{1, 2, 3, 4, 5}
                ).solution()
        );
        assertArrayEquals(
                new int[]{5, 2334454},
                new TheHighestProfitWins(
                        new int[]{2334454, 5}
                ).solution()
        );
        assertArrayEquals(
                new int[]{1, 1},
                new TheHighestProfitWins(
                        new int[]{1}
                ).solution()
        );
    }

    @Test
    public void minMaxRandomTest() {
        for (int i = 0; i < 20; i++) {
            int r = rand.nextInt();
            assertArrayEquals(
                    new int[]{r, r},
                    new TheHighestProfitWins(
                            new int[]{r}
                    ).solution()
            );
        }
    }

}
