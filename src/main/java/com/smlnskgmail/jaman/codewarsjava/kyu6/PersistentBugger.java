package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.util.Arrays;

// https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec
public class PersistentBugger {

    private long input;

    public PersistentBugger(long input) {
        this.input = input;
    }

    public int solution() {
        int counter = 0;
        while (input >= 10) {
            input = Arrays
                    .stream(String.valueOf(input).split(""))
                    .mapToInt(Integer::valueOf)
                    .reduce(1, (a, b) -> a * b);
            counter++;
        }
        return counter;
    }

}
