package com.smlnskgmail.jaman.codewarsjava.kyu8;

import java.util.stream.IntStream;

// https://www.codewars.com/kata/563b74ddd19a3ad462000054
public class StringyStrings {

    private final int input;

    public StringyStrings(int input) {
        this.input = input;
    }

    public String solution() {
        StringBuilder builder = new StringBuilder();
        IntStream
                .range(0, input)
                .forEach(i -> builder.append(i % 2 != 0 ? "0" : "1"));
        return builder.toString();
    }

}
