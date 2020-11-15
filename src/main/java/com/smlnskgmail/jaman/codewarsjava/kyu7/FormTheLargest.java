package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.Arrays;
import java.util.stream.Collectors;

// https://www.codewars.com/kata/5a4ea304b3bfa89a9900008e
public class FormTheLargest {

    private final long maxNumber;

    public FormTheLargest(long maxNumber) {
        this.maxNumber = maxNumber;
    }

    public long solution() {
        return Long.parseLong(
                Arrays.stream(
                        String.valueOf(maxNumber).split("")
                ).sorted((o1, o2) -> -Long.compare(Long.parseLong(o1), Long.parseLong(o2)))
                        .collect(Collectors.joining())
        );
    }

}
