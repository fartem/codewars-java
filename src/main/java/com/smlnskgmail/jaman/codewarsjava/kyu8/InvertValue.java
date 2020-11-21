package com.smlnskgmail.jaman.codewarsjava.kyu8;

import java.util.stream.IntStream;

// https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad
public class InvertValue {

    private final int[] input;

    public InvertValue(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        return IntStream
                .of(input)
                .map(operand -> -operand)
                .toArray();
    }

}
