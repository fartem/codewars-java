package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.stream.Collectors;

// https://www.codewars.com/kata/5656b6906de340bd1b0000ac
public class TwoToOne {

    private final String firstString;
    private final String secondString;

    public TwoToOne(String firstString, String secondString) {
        this.firstString = firstString;
        this.secondString = secondString;
    }

    public String solution() {
        return (firstString + secondString)
                .chars()
                .sorted()
                .distinct()
                .mapToObj(value -> String.valueOf((char) value))
                .collect(Collectors.joining());
    }

}
