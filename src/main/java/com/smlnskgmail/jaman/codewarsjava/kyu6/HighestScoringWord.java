package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/57eb8fcdf670e99d9b000272
public class HighestScoringWord {

    private final String input;

    public HighestScoringWord(String input) {
        this.input = input;
    }

    public String solution() {
        return Arrays
                .stream(input.split(" "))
                .sorted((o1, o2) -> {
                    int firstWordSum = o1.chars().sum();
                    int secondWordSum = o2.chars().sum();
                    return firstWordSum == secondWordSum
                            ? Integer.compare(input.indexOf(o1), input.indexOf(o2))
                            : -Integer.compare(o1.chars().map(i -> i - 96).sum(), o2.chars().map(i -> i - 96).sum());
                })
                .collect(Collectors.toList())
                .get(0);
    }

}
