package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/5939ab6eed348a945f0007b2
public class InspiringStrings {

    private final String input;

    public InspiringStrings(String input) {
        this.input = input;
    }

    public String solution() {
        List<String> words = Arrays.asList(input.split(" "));
        int maxLength = Collections.max(
                words,
                Comparator.comparingInt(String::length)
        ).length();
        List<String> wordsWithMaxLength = words
                .stream()
                .filter(w -> w.length() == maxLength)
                .collect(Collectors.toList());
        return wordsWithMaxLength.get(wordsWithMaxLength.size() - 1);
    }

}
