package com.smlnskgmail.jaman.codewarsjava.kyu8;

import java.util.Arrays;

// https://www.codewars.com/kata/57a2013acf1fa5bfc4000921
public class CalculateAverage {

    private final int[] input;

    public CalculateAverage(int[] input) {
        this.input = input;
    }

    public double solution() {
        return (double) Arrays.stream(input).sum() / input.length;
    }

}
