package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/525f50e3b73515a6db000b83
public class CreatePhoneNumber {

    private final int[] input;

    public CreatePhoneNumber(int[] input) {
        this.input = input;
    }

    public String solution() {
        String numbers = Arrays
                .stream(input)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(""));
        return numbers.replaceFirst(
                "(\\d{3})(\\d{3})(\\d{4})",
                "($1) $2-$3"
        );
    }

}
