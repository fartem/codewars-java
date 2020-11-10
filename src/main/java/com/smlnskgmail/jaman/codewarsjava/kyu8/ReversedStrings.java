package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/5168bb5dfe9a00b126000018
public class ReversedStrings {

    private final String input;

    public ReversedStrings(String input) {
        this.input = input;
    }

    public String solution() {
        return new StringBuilder(input)
                .reverse()
                .toString();
    }

}
