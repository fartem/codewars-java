package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class WhoWonTheElectionTest {

    @Test
    public void testGetWinner01() {
        assertEquals(
                "A",
                new WhoWonTheElection(
                        Collections.singletonList("A")
                ).solution()
        );
    }

    @Test
    public void testGetWinner02() {
        assertEquals(
                "A",
                new WhoWonTheElection(
                        Arrays.asList("A", "A", "A", "B", "B", "B", "A")
                ).solution()
        );
    }

    @Test
    public void testGetWinner03() {
        assertNull(
                new WhoWonTheElection(
                        Arrays.asList("A", "A", "A", "B", "B", "B")
                ).solution()
        );
    }

    @Test
    public void testGetWinner04() {
        assertNull(
                new WhoWonTheElection(
                        Arrays.asList("A", "A", "A", "B", "C", "B")
                ).solution()
        );
    }

    @Test
    public void testGetWinner05() {
        assertNull(
                new WhoWonTheElection(
                        Arrays.asList("A", "A", "B", "B", "C")
                ).solution()
        );
    }

}
