package com.smlnskgmail.jaman.codewarsjava.kyu8;

import java.util.Arrays;

// https://www.codewars.com/kata/576b93db1129fcf2200001e6
public class SumWithoutHighestAndLowestNumber {

    private final int[] input;

    public SumWithoutHighestAndLowestNumber(int[] input) {
        this.input = input;
    }

    public int solution() {
        if (input == null || input.length < 2) {
            return 0;
        }
        final int[] minimumValue = { Integer.MAX_VALUE };
        final int[] maximumValue = { Integer.MIN_VALUE };
        return Arrays.stream(input).peek(operand -> {
            if (operand > maximumValue[0]) {
                maximumValue[0] = operand;
            }
            if (operand < minimumValue[0]) {
                minimumValue[0] = operand;
            }
        }).sum() - minimumValue[0] - maximumValue[0];
    }

}
