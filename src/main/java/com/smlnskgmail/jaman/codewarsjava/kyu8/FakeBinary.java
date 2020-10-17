package com.smlnskgmail.jaman.codewarsjava.kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/57eae65a4321032ce000002d
public class FakeBinary {

    private final String input;

    public FakeBinary(String input) {
        this.input = input;
    }

    public String solution() {
        return Arrays
                .stream(input.split(""))
                .map(s -> {
                    int value = Integer.parseInt(s);
                    return value < 5 ? "0" : "1";
                })
                .collect(Collectors.joining(""));
    }

}
