package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

// https://www.codewars.com/kata/5ac6932b2f317b96980000ca
public class FormTheMinimum {

    private final int[] input;

    public FormTheMinimum(int[] input) {
        this.input = input;
    }

    public int result() {
        return Integer.parseInt(
                IntStream.of(input)
                        .distinct()
                        .sorted()
                        .mapToObj(String::valueOf)
                        .collect(Collectors.joining(""))
        );
    }

}
