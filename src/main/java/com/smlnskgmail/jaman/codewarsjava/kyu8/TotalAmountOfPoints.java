package com.smlnskgmail.jaman.codewarsjava.kyu8;

import java.util.Arrays;

// https://www.codewars.com/kata/5bb904724c47249b10000131
public class TotalAmountOfPoints {

    private final String[] input;

    public TotalAmountOfPoints(String[] input) {
        this.input = input;
    }

    public int result() {
        return Arrays.stream(input).mapToInt(value -> {
            int x = value.charAt(0);
            int y = value.charAt(2);
            return x > y ? 3 : x == y ? 1 : 0;
        }).sum();
    }

}
