package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.util.Arrays;

// https://www.codewars.com/kata/578aa45ee9fd15ff4600090d
public class SortTheOdd {

    private final int[] input;

    public SortTheOdd(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        int[] odd = Arrays
                .stream(input)
                .filter(v -> v % 2 != 0)
                .sorted()
                .toArray();
        for (int i = 0, j = 0; i < input.length; i++) {
            if (input[i] % 2 != 0) {
                input[i] = odd[j++];
            }
        }
        return input;
    }

}
