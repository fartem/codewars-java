package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.Arrays;
import java.util.stream.IntStream;

// https://www.codewars.com/kata/56f3a1e899b386da78000732
public class PartsOfAList {

    private final String[] input;

    public PartsOfAList(String[] input) {
        this.input = input;
    }

    public String[][] solution() {
        String[][] result = new String[input.length - 1][2];
        IntStream
                .range(0, input.length - 1)
                .forEach(value -> {
                    int indexFromValue = value + 1;
                    result[value][0] = String.join(
                            " ",
                            Arrays.copyOfRange(input, 0, indexFromValue)
                    );
                    result[value][1] = String.join(
                            " ",
                            Arrays.copyOfRange(input, indexFromValue, input.length)
                    );
                });
        return result;
    }

}
