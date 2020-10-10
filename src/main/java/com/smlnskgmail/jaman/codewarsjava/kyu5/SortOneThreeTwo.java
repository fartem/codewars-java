package com.smlnskgmail.jaman.codewarsjava.kyu5;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/56f4ff45af5b1f8cd100067d
public class SortOneThreeTwo {

    private static final String[] UNITS = {
            "",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "fifteen",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen"
    };

    private static final String[] TENS = {
            "",
            "",
            "twenty",
            "thirty",
            "forty",
            "fifty",
            "sixty",
            "seventy",
            "eighty",
            "ninety"
    };

    private final int[] input;

    public SortOneThreeTwo(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        return Arrays
                .stream(input)
                .mapToObj(value -> new Value(value == 0 ? "zero" : convert(value), value))
                .sorted()
                .collect(Collectors.toList())
                .stream()
                .mapToInt(v -> v.number)
                .toArray();
    }

    private String convert(final int n) {
        if (n < 20) {
            return UNITS[n];
        }
        if (n < 100) {
            return TENS[n / 10] + ((n % 10 != 0) ? "" : "") + UNITS[n % 10];
        }
        return UNITS[n / 100] + " hundred" + ((n % 100 != 0) ? " and " : "") + convert(n % 100);
    }

    private static class Value implements Comparable<Value> {

        private final String string;
        private final int number;

        public Value(String string, int number) {
            this.string = string;
            this.number = number;
        }

        @Override
        public int compareTo(Value o) {
            return this.string.compareTo(o.string);
        }

    }

}
