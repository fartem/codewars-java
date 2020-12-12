package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.Arrays;

// https://www.codewars.com/kata/59887207635904314100007b
public class ClosestToZero {

    private final int[] input;

    public ClosestToZero(int[] input) {
        this.input = input;
    }

    public Integer solution() {
        int minimum = Integer.MAX_VALUE;
        for (int number : input) {
            if (number == 0) {
                return number;
            }
            if (Integer.compare(Math.abs(number), Math.abs(minimum)) == -1) {
                minimum = number;
            }
        }
        int finalMinimum = minimum;
        return Arrays.stream(input).filter(i -> i == -finalMinimum).count() > 0
                ? null
                : minimum;
    }

}
