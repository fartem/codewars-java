package com.smlnskgmail.jaman.codewarsjava.kyu8;

import java.util.Arrays;

// https://www.codewars.com/kata/54edbc7200b811e956000556
public class CountingSheep {

    private final Boolean[] input;

    public CountingSheep(Boolean[] input) {
        this.input = input;
    }

    public int solution() {
        return (int) Arrays
                .stream(input, 0, input.length)
                .filter(b -> b != null && b)
                .count();
    }

}
