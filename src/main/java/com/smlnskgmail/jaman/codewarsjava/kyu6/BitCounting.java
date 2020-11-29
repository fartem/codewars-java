package com.smlnskgmail.jaman.codewarsjava.kyu6;

// https://www.codewars.com/kata/526571aae218b8ee490006f4
public class BitCounting {

    private final int input;

    public BitCounting(int input) {
        this.input = input;
    }

    public int solution() {
        return Integer.bitCount(input);
    }

}
