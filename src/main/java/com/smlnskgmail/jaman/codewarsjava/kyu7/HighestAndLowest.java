package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.Arrays;

// https://www.codewars.com/kata/554b4ac871d6813a03000035
public class HighestAndLowest {

    private final String input;

    public HighestAndLowest(String input) {
        this.input = input;
    }

    public String solution() {
        int[] parsedNumber = Arrays
                .stream(input.split(" "))
                .mapToInt(Integer::valueOf)
                .toArray();
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;
        for (int i : parsedNumber) {
            if (minimum > i) {
                minimum = i;
            }
            if (i > maximum) {
                maximum = i;
            }
        }
        return String.format(
                "%d %d",
                maximum,
                minimum
        );
    }

}
