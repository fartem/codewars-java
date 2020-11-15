package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

// https://www.codewars.com/kata/5c55ad8c9d76d41a62b4ede3
public class FindAllPairs {

    private final int[] input;

    public FindAllPairs(int[] input) {
        this.input = input;
    }

    public int solution() {
        int count = 0;
        Map<Integer, Integer> valuesWithCount = new HashMap<>();
        IntStream.of(input)
                .forEach(i -> valuesWithCount.merge(i, 1, Integer::sum));
        for (Map.Entry<Integer, Integer> entry : valuesWithCount.entrySet()) {
            count += entry.getValue() / 2;
        }
        return count;
    }

}
