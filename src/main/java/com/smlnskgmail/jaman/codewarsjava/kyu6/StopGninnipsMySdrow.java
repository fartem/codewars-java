package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/5264d2b162488dc400000001
public class StopGninnipsMySdrow {

    private final String input;

    public StopGninnipsMySdrow(String input) {
        this.input = input;
    }

    public String solution() {
        return Arrays
                .stream(input.split(" "))
                .map(s -> s.length() >= 5 ? new StringBuilder(s).reverse().toString() : s)
                .collect(Collectors.joining(" "));
    }

}
