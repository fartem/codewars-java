package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FindNumbersWhichAreDivisibleByGivenNumberTest {

    @Test
    public void testSimple() {
        assertArrayEquals(
                new int[]{2, 4, 6},
                new FindNumbersWhichAreDivisibleByGivenNumber(new int[]{1, 2, 3, 4, 5, 6}, 2).solution()
        );
        assertArrayEquals(
                new int[]{3, 6},
                new FindNumbersWhichAreDivisibleByGivenNumber(new int[]{1, 2, 3, 4, 5, 6}, 3).solution()
        );
        assertArrayEquals(
                new int[]{0, 4},
                new FindNumbersWhichAreDivisibleByGivenNumber(new int[]{0, 1, 2, 3, 4, 5, 6}, 4).solution()
        );
    }

}
