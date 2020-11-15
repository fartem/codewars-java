package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BackwardsReadPrimesTest {

    @Test
    public void backWardsPrime13() {
        assertEquals(
                "13 17 31 37 71 73 79 97",
                new BackwardsReadPrimes(1, 100).solution()
        );
    }

    @Test
    public void backWardsPrime21() {
        assertEquals(
                "9923 9931 9941 9967",
                new BackwardsReadPrimes(9900, 10000).solution()
        );
    }

}
