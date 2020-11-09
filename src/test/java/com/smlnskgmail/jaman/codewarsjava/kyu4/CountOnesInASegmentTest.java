package com.smlnskgmail.jaman.codewarsjava.kyu4;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class CountOnesInASegmentTest {

    @Test
    public void sampleTests() {
        assertEquals(
                new BigInteger("7"),
                new CountOnesInASegment(5, 7).solution()
        );
        assertEquals(
                new BigInteger("51"),
                new CountOnesInASegment(12, 29).solution()
        );
    }

}
