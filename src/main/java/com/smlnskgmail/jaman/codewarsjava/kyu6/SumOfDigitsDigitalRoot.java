package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.util.Arrays;

// https://www.codewars.com/kata/541c8630095125aba6000c00
public class SumOfDigitsDigitalRoot {

    private final int input;

    public SumOfDigitsDigitalRoot(int input) {
        this.input = input;
    }

    public int solution() {
        int result = input;
        while (result > 10) {
            result = Arrays
                    .stream(String.valueOf(result).split(""))
                    .mapToInt(Integer::parseInt)
                    .sum();
        }
        return result;
    }

}
