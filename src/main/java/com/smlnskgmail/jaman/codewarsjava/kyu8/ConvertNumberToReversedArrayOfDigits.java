package com.smlnskgmail.jaman.codewarsjava.kyu8;

import java.util.Arrays;

// https://www.codewars.com/kata/5583090cbe83f4fd8c000051
public class ConvertNumberToReversedArrayOfDigits {

    private final long input;

    public ConvertNumberToReversedArrayOfDigits(long input) {
        this.input = input;
    }

    public int[] solution() {
        return Arrays
                .stream(
                        new StringBuilder(String.valueOf(input))
                                .reverse()
                                .toString()
                                .split("")
                )
                .mapToInt(Integer::valueOf)
                .toArray();
    }

}
