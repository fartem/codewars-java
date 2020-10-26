package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/546e2562b03326a88e000020
public class SquareEveryDigit {

    private final int input;

    public SquareEveryDigit(int input) {
        this.input = input;
    }

    public int solution() {
        return Integer.parseInt(
                Arrays
                        .stream(String.valueOf(input).split(""))
                        .map(s -> {
                            int value = Integer.parseInt(s);
                            return String.valueOf(value * value);
                        })
                        .collect(Collectors.joining())
        );
    }

}
