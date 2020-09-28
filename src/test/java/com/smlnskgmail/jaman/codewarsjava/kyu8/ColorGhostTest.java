package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class ColorGhostTest {

    @Test
    public void basicTest() {
        assertNotNull(
                new ColorGhost().solution()
        );
    }

}
