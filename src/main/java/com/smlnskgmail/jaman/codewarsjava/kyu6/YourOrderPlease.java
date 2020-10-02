package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/55c45be3b2079eccff00010f
public class YourOrderPlease {

    private final String input;

    public YourOrderPlease(String input) {
        this.input = input;
    }

    public String solution() {
        return Arrays
                .stream(input.split(" "))
                .sorted((o1, o2) -> {
                    int numberOfFirstString = Integer.parseInt(o1.replaceAll("\\D+", ""));
                    int numberOfSecondString = Integer.parseInt(o2.replaceAll("\\D+", ""));
                    return Integer.compare(numberOfFirstString, numberOfSecondString);
                })
                .collect(Collectors.joining(" "));
    }

}
