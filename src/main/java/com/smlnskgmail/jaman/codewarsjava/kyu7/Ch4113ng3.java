package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/59e9f404fc3c49ab24000112
public class Ch4113ng3 {

    private final String input;

    public Ch4113ng3(String input) {
        this.input = input;
    }

    public String solution() {
        return Arrays
                .stream(input.split(""))
                .map(s -> {
                    String lowerCaseString = s.toLowerCase();
                    switch (lowerCaseString) {
                        case "a":
                            return "4";
                        case "e":
                            return "3";
                        default:
                            return s.equals("l") ? "1" : s;
                    }
                })
                .collect(Collectors.joining());
    }

}
