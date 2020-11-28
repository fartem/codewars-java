package com.smlnskgmail.jaman.codewarsjava.kyu8;

import java.util.stream.IntStream;

// https://www.codewars.com/kata/56676e8fabd2d1ff3000000c
public class ANeedleInTheHaystack {

    private final Object[] input;

    public ANeedleInTheHaystack(Object[] input) {
        this.input = input;
    }

    public String solution() {
        int index = IntStream
                .range(0, input.length)
                .filter(value -> {
                    Object data = input[value];
                    return data instanceof String && data.equals("needle");
                })
                .findFirst()
                .orElse(-1);
        return String.format(
                "found the needle at position %d",
                index
        );
    }

}
