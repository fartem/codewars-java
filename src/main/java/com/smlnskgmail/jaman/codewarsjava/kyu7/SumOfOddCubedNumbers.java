package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.stream.IntStream;

// https://www.codewars.com/kata/580dda86c40fa6c45f00028a
public class SumOfOddCubedNumbers {

    private final int[] input;

    public SumOfOddCubedNumbers(int[] input) {
        this.input = input;
    }

    public int solution() {
        return IntStream
                .of(input)
                .map(i -> i * i * i)
                .filter(i -> i % 2 != 0)
                .sum();
    }

}
