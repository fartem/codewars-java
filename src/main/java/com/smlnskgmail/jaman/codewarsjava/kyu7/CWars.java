package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

// https://www.codewars.com/kata/55968ab32cf633c3f8000008
public class CWars {

    private final String input;

    public CWars(String input) {
        this.input = input;
    }

    public String solution() {
        String[] words = input.split(" ");
        int length = words.length - 1;
        return IntStream
                .rangeClosed(0, length)
                .mapToObj(i -> {
                    String word = words[i];
                    char firstSymbol = Character.toUpperCase(word.charAt(0));
                    return i != length
                            ? String.format("%s.", firstSymbol)
                            : String.format("%s%s", firstSymbol, word.substring(1));
                })
                .collect(Collectors.joining());
    }

}
