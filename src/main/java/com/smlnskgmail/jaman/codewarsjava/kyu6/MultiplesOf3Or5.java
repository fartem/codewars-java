package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.util.stream.IntStream;

// https://www.codewars.com/kata/514b92a657cdc65150000006
public class MultiplesOf3Or5 {

    private final int input;

    public MultiplesOf3Or5(int input) {
        this.input = input;
    }

    public int solution() {
        return IntStream
                .range(3, input)
                .filter(i -> i % 3 == 0 || i % 5 == 0)
                .distinct()
                .sum();
    }

}
