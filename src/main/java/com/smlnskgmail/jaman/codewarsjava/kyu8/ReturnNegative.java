package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/55685cd7ad70877c23000102
public class ReturnNegative {

    private final int input;

    public ReturnNegative(int input) {
        this.input = input;
    }

    public int solution() {
        return -Math.abs(input);
    }

}
