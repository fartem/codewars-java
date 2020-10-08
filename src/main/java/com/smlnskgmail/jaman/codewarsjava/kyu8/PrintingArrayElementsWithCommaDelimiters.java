package com.smlnskgmail.jaman.codewarsjava.kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/56e2f59fb2ed128081001328
public class PrintingArrayElementsWithCommaDelimiters {

    private final Object[] input;

    public PrintingArrayElementsWithCommaDelimiters(
            Object[] input
    ) {
        this.input = input;
    }

    public String solution() {
        return Arrays
                .stream(input)
                .map(Object::toString)
                .collect(Collectors.joining(","));
    }

}
