package com.smlnskgmail.jaman.codewarsjava.kyu8;

import java.util.stream.IntStream;

// https://www.codewars.com/kata/55edaba99da3a9c84000003b
public class FindNumbersWhichAreDivisibleByGivenNumber {

    private final int[] numbers;
    private final int divider;

    public FindNumbersWhichAreDivisibleByGivenNumber(
            int[] numbers,
            int divider
    ) {
        this.numbers = numbers;
        this.divider = divider;
    }

    public int[] solution() {
        return IntStream
                .of(numbers)
                .filter(value -> value % divider == 0)
                .toArray();
    }

}
