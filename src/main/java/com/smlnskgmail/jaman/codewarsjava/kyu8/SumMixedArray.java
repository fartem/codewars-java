package com.smlnskgmail.jaman.codewarsjava.kyu8;

import java.util.List;
import java.util.function.ToIntFunction;

// https://www.codewars.com/kata/57eaeb9578748ff92a000009
public class SumMixedArray {

    private final List<?> input;

    public SumMixedArray(List<?> input) {
        this.input = input;
    }

    public int solution() {
        return input
                .stream()
                .mapToInt(
                        (ToIntFunction<Object>) value -> value instanceof String
                                ? Integer.parseInt((String) value)
                                : (int) value
                )
                .sum();
    }

}
