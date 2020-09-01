package com.smlnskgmail.jaman.codewarsjava.kyu8;

import java.util.Collections;
import java.util.stream.IntStream;

// https://www.codewars.com/kata/5a00e05cc374cb34d100000d
public class ReversedSequence {

    private final int n;

    public ReversedSequence(int n) {
        this.n = n;
    }

    public int[] result() {
        return IntStream.rangeClosed(1, n)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::valueOf)
                .toArray();
    }

}
