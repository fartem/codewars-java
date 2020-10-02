package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/55d7e5aa7b619a86ed000070
public class OrderingTheWords {

    private final String input;

    public OrderingTheWords(String input) {
        this.input = input;
    }

    public String solution() {
        return input == null
                || input.isEmpty()
                || input.equals("Invalid String!")
                ? "Invalid String!"
                : Arrays
                .stream(input.split(""))
                .sorted(String::compareTo)
                .collect(Collectors.joining());
    }

}
