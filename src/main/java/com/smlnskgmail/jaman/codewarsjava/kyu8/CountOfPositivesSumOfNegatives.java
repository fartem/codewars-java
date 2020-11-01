package com.smlnskgmail.jaman.codewarsjava.kyu8;

import java.util.stream.IntStream;

// https://www.codewars.com/kata/576bb71bbbcf0951d5000044
public class CountOfPositivesSumOfNegatives {

    private final int[] input;

    public CountOfPositivesSumOfNegatives(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        if (input == null) {
            return new int[]{};
        }
        int positivesCount = (int) IntStream
                .of(input)
                .filter(value -> value > 0)
                .count();
        int negativesSum = IntStream
                .of(input)
                .filter(value -> value < 0)
                .sum();
        if (positivesCount == 0 && negativesSum == 0) {
            return new int[]{};
        }
        return new int[] { positivesCount, negativesSum };
    }

}
