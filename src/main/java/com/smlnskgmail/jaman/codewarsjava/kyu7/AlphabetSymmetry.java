package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;

// https://www.codewars.com/kata/59d9ff9f7905dfeed50000b0
public class AlphabetSymmetry {

    private final String[] input;

    public AlphabetSymmetry(String[] input) {
        this.input = input;
    }

    public int[] solution() {
        int[] result = new int[input.length];
        final int[] currentWordIndex = {0};
        Arrays
                .stream(input)
                .forEach(s -> {
                    IntStream.range(0, s.length()).forEach(value -> {
                        char charAt = s.charAt(value);
                        String letter = String.valueOf(charAt);
                        int asciiOffset = letter.toLowerCase().equals(letter) ? 96 : 64;
                        if (charAt - asciiOffset == value + 1) {
                            result[currentWordIndex[0]]++;
                        }
                    });
                    currentWordIndex[0]++;
                });
        return result;
    }

}
