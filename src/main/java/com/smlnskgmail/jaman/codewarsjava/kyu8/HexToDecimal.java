package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/57a4d500e298a7952100035d
public class HexToDecimal {

    private final String input;

    public HexToDecimal(String input) {
        this.input = input;
    }

    public int solution() {
        return Integer.parseInt(input, 16);
    }

}
