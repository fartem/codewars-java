package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/5b4070144d7d8bbfe7000001
public class NumericalsOfAString {

    private final String input;

    public NumericalsOfAString(String input) {
        this.input = input;
    }

    public String result() {
        Map<String, Integer> symbols = new HashMap<>();
        return Arrays
                .stream(input.split("")).map(s -> {
                    symbols.merge(s, 1, Integer::sum);
                    return String.valueOf(symbols.get(s));
                })
                .collect(Collectors.joining());
    }

}
