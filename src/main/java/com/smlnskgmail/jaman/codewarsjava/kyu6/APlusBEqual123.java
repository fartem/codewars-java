package com.smlnskgmail.jaman.codewarsjava.kyu6;

// https://www.codewars.com/kata/5966a52ab4f24db1800000cc
public class APlusBEqual123 {

    private final int input;

    public APlusBEqual123(int input) {
        this.input = input;
    }

    public long solution() {
        return Integer.toUnsignedLong(123 - input);
    }

}
