package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WorldBitsWarTest {

    @Test
    public void basicBitsWarTests() {
        assertEquals(
                "odds win",
                new WorldBitsWar(new int[]{1, 5, 12}).solution()
        );
        assertEquals(
                "evens win",
                new WorldBitsWar(new int[]{7, -3, 20}).solution()
        );
        assertEquals(
                "tie",
                new WorldBitsWar(new int[]{7, -3, -2, 6}).solution()
        );
        assertEquals(
                "evens win",
                new WorldBitsWar(new int[]{-3, -5}).solution()
        );
        assertEquals(
                "tie",
                new WorldBitsWar(new int[]{}).solution()
        );
    }

}
