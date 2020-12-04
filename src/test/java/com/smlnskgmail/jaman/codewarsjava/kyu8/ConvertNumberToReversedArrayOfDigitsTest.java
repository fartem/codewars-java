package com.smlnskgmail.jaman.codewarsjava.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ConvertNumberToReversedArrayOfDigitsTest {

    @Test
    public void tests() {
        assertArrayEquals(
                new int[]{1, 3, 2, 5, 3},
                new ConvertNumberToReversedArrayOfDigits(35231).solution()
        );
    }

}
