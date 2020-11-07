package com.smlnskgmail.jaman.codewarsjava.kyu8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// https://www.codewars.com/kata/51c8991dee245d7ddf00000e
public class ReversedWords {

    private final String input;

    public ReversedWords(String input) {
        this.input = input;
    }

    public String solution() {
        List<String> words = Arrays.asList(input.split(" "));
        Collections.reverse(words);
        return String.join(" ", words);
    }

}
