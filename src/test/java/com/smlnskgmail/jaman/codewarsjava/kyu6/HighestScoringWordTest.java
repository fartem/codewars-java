package com.smlnskgmail.jaman.codewarsjava.kyu6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HighestScoringWordTest {

    @Test
    public void sampleTests() {
        assertEquals(
                "taxi",
                new HighestScoringWord("man i need a taxi up to ubud").solution()
        );
        assertEquals(
                "volcano",
                new HighestScoringWord("what time are we climbing up to the volcano").solution()
        );
        assertEquals(
                "semynak",
                new HighestScoringWord("take me to semynak").solution()
        );
    }

}
