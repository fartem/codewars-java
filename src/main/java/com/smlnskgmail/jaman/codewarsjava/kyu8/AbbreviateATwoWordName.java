package com.smlnskgmail.jaman.codewarsjava.kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3
public class AbbreviateATwoWordName {

    private final String input;

    public AbbreviateATwoWordName(String input) {
        this.input = input;
    }

    public String solution() {
        return Arrays
                .stream(input.split(" "))
                .map(s -> String.valueOf(s.charAt(0)).toUpperCase())
                .collect(Collectors.joining("."));
    }

}
