package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/5831c204a31721e2ae000294
public class ChangingLetters {

    private final String input;

    public ChangingLetters(String input) {
        this.input = input;
    }

    public String solution() {
        return Arrays
                .stream(input.split(""))
                .map(s -> {
                    switch (s) {
                        case "a":
                        case "e":
                        case "i":
                        case "o":
                        case "u":
                            return s.toUpperCase();
                        default:
                            return s;
                    }
                })
                .collect(Collectors.joining(""));
    }

}
