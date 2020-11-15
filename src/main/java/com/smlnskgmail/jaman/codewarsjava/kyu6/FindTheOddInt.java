package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// https://www.codewars.com/kata/54da5a58ea159efa38000836
public class FindTheOddInt {

    private final int[] input;

    public FindTheOddInt(int[] input) {
        this.input = input;
    }

    public int solution() {
        Map<Integer, Integer> numbers = new HashMap<>();
        Arrays
                .stream(input)
                .forEach(value -> numbers.merge(value, 1, Integer::sum));
        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                return entry.getKey();
            }
        }
        return -1;
    }

}
