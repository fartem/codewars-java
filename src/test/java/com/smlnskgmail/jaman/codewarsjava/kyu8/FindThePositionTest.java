package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindThePositionTest {

    @Test
    public void basicTests() {
        assertEquals(
                "Position of alphabet: 1",
                new FindThePosition('a').solution()
        );
        assertEquals(
                "Position of alphabet: 26",
                new FindThePosition('z').solution()
        );
        assertEquals(
                "Position of alphabet: 5",
                new FindThePosition('e').solution()
        );
    }

}
