package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.Arrays;

// https://www.codewars.com/kata/577ad961ae2807182f000c29
public class CountTheCharacters {

    private final String string;
    private final char character;

    public CountTheCharacters(String string, char character) {
        this.string = string;
        this.character = character;
    }

    public int solution() {
        String characterAsString = String.valueOf(character);
        return (int) Arrays
                .stream(string.split(""))
                .filter(s -> s.equalsIgnoreCase(characterAsString))
                .count();
    }

}
