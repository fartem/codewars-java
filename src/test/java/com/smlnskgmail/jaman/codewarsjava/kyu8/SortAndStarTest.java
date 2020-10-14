package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SortAndStarTest {

    @Test
    public void testFixed() {
        assertEquals(
                "b***i***t***c***o***i***n",
                new SortAndStar(
                        new String[] { "bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps" }
                ).solution()
        );
        assertEquals(
                "a***r***e",
                new SortAndStar(
                        new String[] { "turns", "out", "random", "test", "cases", "are", "easier", "than", "writing", "out", "basic", "ones" }
                ).solution()
        );
    }

}
