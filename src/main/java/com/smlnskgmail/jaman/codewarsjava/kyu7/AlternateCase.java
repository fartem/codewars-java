package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.stream.Collectors;

// https://www.codewars.com/kata/57a62154cf1fa5b25200031e
public class AlternateCase {

    private final String input;

    public AlternateCase(String input) {
        this.input = input;
    }

    public String solution() {
        return input.chars().mapToObj(i -> {
            char symbol = (char) i;
            if (!Character.isLetter(symbol)) {
                return String.valueOf((char) i);
            }
            return String.valueOf(
                    Character.isLowerCase(symbol)
                            ? Character.toUpperCase(symbol)
                            : Character.toLowerCase(symbol)
            );
        }).collect(Collectors.joining(""));
    }

}
