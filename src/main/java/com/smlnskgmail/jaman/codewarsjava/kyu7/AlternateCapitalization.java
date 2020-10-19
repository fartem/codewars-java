package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

// https://www.codewars.com/kata/59cfc000aeb2844d16000075
public class AlternateCapitalization {

    private final String input;

    public AlternateCapitalization(String input) {
        this.input = input;
    }

    public String[] solution() {
        String capitalization = IntStream
                .range(0, input.length())
                .mapToObj(value -> {
                    String letter = String.valueOf(input.charAt(value));
                    return value % 2 == 0 ? letter.toUpperCase() : letter;
                })
                .collect(Collectors.joining());
        String alternateCapitalization = IntStream
                .range(0, input.length())
                .mapToObj(value -> {
                    String letter = String.valueOf(input.charAt(value));
                    return value % 2 != 0 ? letter.toUpperCase() : letter;
                })
                .collect(Collectors.joining());
        return new String[] { capitalization, alternateCapitalization };
    }

}
