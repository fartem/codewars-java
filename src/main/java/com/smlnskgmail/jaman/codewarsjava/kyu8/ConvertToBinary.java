package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/59fca81a5712f9fa4700159a
public class ConvertToBinary {

    private final int input;

    public ConvertToBinary(int input) {
        this.input = input;
    }

    public int solution() {
        return Integer.parseInt(Integer.toBinaryString(input));
    }

}
