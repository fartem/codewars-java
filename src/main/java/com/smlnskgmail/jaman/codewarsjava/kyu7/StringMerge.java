package com.smlnskgmail.jaman.codewarsjava.kyu7;

// https://www.codewars.com/kata/597bb84522bc93b71e00007e
public class StringMerge {

    private final String firstString;
    private final String secondString;
    private final char character;

    public StringMerge(
            String firstString,
            String secondString,
            char character
    ) {
        this.firstString = firstString;
        this.secondString = secondString;
        this.character = character;
    }

    public String solution() {
        return firstString.substring(0, firstString.indexOf(character))
                + secondString.substring(secondString.indexOf(character));
    }

}
