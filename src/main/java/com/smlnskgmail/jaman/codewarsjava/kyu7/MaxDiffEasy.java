package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.Arrays;

// https://www.codewars.com/kata/588a3c3ef0fbc9c8e1000095
public class MaxDiffEasy {

    private final int[] input;

    public MaxDiffEasy(int[] input) {
        this.input = input;
    }

    public int solution() {
        int maximum = Arrays
                .stream(input)
                .max()
                .orElse(0);
        int minimum = Arrays
                .stream(input)
                .min()
                .orElse(0);
        return maximum - minimum;
    }

}
