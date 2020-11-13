package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/5467e4d82edf8bbf40000155
public class DescendingOrder {

    private final int input;

    public DescendingOrder(int input) {
        this.input = input;
    }

    public int solution() {
        return Integer.parseInt(
                Arrays
                        .stream(String.valueOf(input).split(""))
                        .sorted((o1, o2) -> -o1.compareTo(o2))
                        .collect(Collectors.joining())
        );
    }

}
