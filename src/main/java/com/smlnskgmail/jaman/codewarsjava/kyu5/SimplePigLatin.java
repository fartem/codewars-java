package com.smlnskgmail.jaman.codewarsjava.kyu5;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/520b9d2ad5c005041100000f
public class SimplePigLatin {

    private final String input;

    public SimplePigLatin(String input) {
        this.input = input;
    }

    public String solution() {
        return Arrays
                .stream(input.split(" "))
                .map(this::pigLatinWord)
                .collect(Collectors.joining(" "));
    }

    private String pigLatinWord(String word) {
        if (word.length() == 0) {
            return "";
        }
        char firstSymbol = word.charAt(0);
        if (word.length() == 1 && !Character.isLetter(firstSymbol)) {
            return String.valueOf(firstSymbol);
        }
        return word.substring(1) + firstSymbol + "ay";
    }

}
