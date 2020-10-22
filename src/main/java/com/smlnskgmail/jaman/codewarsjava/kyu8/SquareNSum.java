package com.smlnskgmail.jaman.codewarsjava.kyu8;

import java.util.stream.IntStream;

// https://www.codewars.com/kata/515e271a311df0350d00000f
public class SquareNSum {

    private final int[] input;

    public SquareNSum(int[] input) {
        this.input = input;
    }

    public int solution() {
        return IntStream
                .of(input)
                .map(operand -> operand * operand)
                .sum();
    }

}
