package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.Arrays;

// https://www.codewars.com/kata/5b180e9fedaa564a7000009a
public class FixStringCase {

    private final String input;

    public FixStringCase(String input) {
        this.input = input;
    }

    public String result() {
        if (input.isEmpty()) {
            return input;
        }
        boolean isUpperCase = Arrays
                .stream(input.split(""))
                .filter(s -> s.toUpperCase().equals(s))
                .count() > input.length() / 2;
        return isUpperCase
                ? input.toUpperCase()
                : input.toLowerCase();
    }

}
