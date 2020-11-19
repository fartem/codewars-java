package com.smlnskgmail.jaman.codewarsjava.kyu8;

import java.util.stream.IntStream;

// https://www.codewars.com/kata/5715eaedb436cf5606000381
public class SumOfPositive {

    private final int[] input;

    public SumOfPositive(int[] input) {
        this.input = input;
    }

    public int solution() {
        return IntStream
                .of(input)
                .filter(n -> n >= 0)
                .sum();
    }

}
