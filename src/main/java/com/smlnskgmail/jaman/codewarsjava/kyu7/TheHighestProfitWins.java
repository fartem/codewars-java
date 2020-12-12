package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.stream.IntStream;

// https://www.codewars.com/kata/559590633066759614000063
public class TheHighestProfitWins {

    private final int[] input;

    public TheHighestProfitWins(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        //noinspection OptionalGetWithoutIsPresent
        return new int[]{
                IntStream.of(input).min().getAsInt(),
                IntStream.of(input).max().getAsInt()
        };
    }

}
