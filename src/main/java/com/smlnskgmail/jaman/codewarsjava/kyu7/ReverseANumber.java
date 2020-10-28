package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.math.BigInteger;

// https://www.codewars.com/kata/555bfd6f9f9f52680f0000c5
public class ReverseANumber {

    private final int input;

    public ReverseANumber(int input) {
        this.input = input;
    }

    public int solution() {
        String numberAsString = String.valueOf(input);
        boolean negative = numberAsString.startsWith("-");
        int result = new BigInteger(
                new StringBuilder(
                        negative
                                ? numberAsString.substring(1)
                                : numberAsString
                ).reverse().toString()
        ).intValue();
        return negative ? -result : result;
    }

}
