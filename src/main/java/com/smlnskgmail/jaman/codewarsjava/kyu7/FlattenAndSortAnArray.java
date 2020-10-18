package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.Arrays;

// https://www.codewars.com/kata/57ee99a16c8df7b02d00045f
public class FlattenAndSortAnArray {

    private final int[][] input;

    public FlattenAndSortAnArray(int[][] input) {
        this.input = input;
    }

    public int[] solution() {
        return Arrays
                .stream(input)
                .flatMapToInt(Arrays::stream)
                .sorted()
                .toArray();
    }

}
