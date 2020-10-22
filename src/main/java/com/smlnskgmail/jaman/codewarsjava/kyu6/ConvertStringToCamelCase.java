package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

// https://www.codewars.com/kata/517abf86da9663f1d2000003
public class ConvertStringToCamelCase {

    private final String input;

    public ConvertStringToCamelCase(String input) {
        this.input = input;
    }

    public String solution() {
        boolean isDashSeparator = input.contains("-");
        String[] words = input.split(isDashSeparator ? "-" : "_");
        return words.length == 0
                ? input
                : words[0] + IntStream
                .range(1, words.length)
                .mapToObj(value -> {
                    String word = words[value];
                    char firstSymbol = word.charAt(0);
                    return Character.toUpperCase(firstSymbol) + word.substring(1);
                })
                .collect(Collectors.joining());
    }

}
