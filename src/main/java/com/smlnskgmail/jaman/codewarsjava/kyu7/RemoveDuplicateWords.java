package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.Arrays;
import java.util.LinkedHashSet;

// https://www.codewars.com/kata/5b39e3772ae7545f650000fc
public class RemoveDuplicateWords {

    private final String input;

    public RemoveDuplicateWords(String input) {
        this.input = input;
    }

    public String result() {
        return String.join(
                " ",
                new LinkedHashSet<>(
                        Arrays.asList(
                                input.split(" ")
                        )
                )
        );
    }

}
