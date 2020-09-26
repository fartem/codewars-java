package com.smlnskgmail.jaman.codewarsjava.kyu7;

// https://www.codewars.com/kata/51f2d1cafc9c0f745c00037d
public class StringEndsWith {

    private final String input;
    private final String ending;

    public StringEndsWith(String input, String ending) {
        this.input = input;
        this.ending = ending;
    }

    public boolean solution() {
        return input.endsWith(ending);
    }

}
