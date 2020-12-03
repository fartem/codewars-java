package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/583710ccaa6717322c000105
public class SimpleMultiplication {

    private final int input;

    public SimpleMultiplication(int input) {
        this.input = input;
    }

    public int solution() {
        return input % 2 == 0 ? input * 8 : input * 9;
    }

}
