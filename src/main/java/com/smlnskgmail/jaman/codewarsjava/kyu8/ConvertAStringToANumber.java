package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/544675c6f971f7399a000e79
public class ConvertAStringToANumber {

    private final String input;

    public ConvertAStringToANumber(String input) {
        this.input = input;
    }

    public int solution() {
        return Integer.parseInt(input);
    }

}
