package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/5556282156230d0e5e000089
public class DNAToRNAConversion {

    private final String input;

    public DNAToRNAConversion(String input) {
        this.input = input;
    }

    public String solution() {
        return input.replaceAll("T", "U");
    }

}
