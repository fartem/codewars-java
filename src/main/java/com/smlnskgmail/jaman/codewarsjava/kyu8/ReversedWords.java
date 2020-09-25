package com.smlnskgmail.jaman.codewarsjava.kyu8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReversedWords {

    private final String input;

    public ReversedWords(String input) {
        this.input = input;
    }

    public String result() {
        List<String> words = Arrays.asList(input.split(" "));
        Collections.reverse(words);
        return String.join(" ", words);
    }

}
