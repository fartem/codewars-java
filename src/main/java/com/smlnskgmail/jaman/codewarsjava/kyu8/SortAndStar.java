package com.smlnskgmail.jaman.codewarsjava.kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/57cfdf34902f6ba3d300001e
public class SortAndStar {

    private final String[] input;

    public SortAndStar(String[] input) {
        this.input = input;
    }

    public String solution() {
        return String.join(
                "***",
                Arrays
                        .stream(input)
                        .sorted()
                        .collect(Collectors.toList())
                        .get(0)
                        .split("")
        );
    }

}
