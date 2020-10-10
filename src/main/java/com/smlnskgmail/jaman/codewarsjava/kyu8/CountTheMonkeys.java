package com.smlnskgmail.jaman.codewarsjava.kyu8;

import java.util.stream.IntStream;

// https://www.codewars.com/kata/56f69d9f9400f508fb000ba7
public class CountTheMonkeys {

    private final int input;

    public CountTheMonkeys(int input) {
        this.input = input;
    }

    public int[] solution() {
        return IntStream
                .rangeClosed(1, input)
                .toArray();
    }

}
