package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/596c6eb85b0f515834000049
public class FIXMEReplaceAllDots {

    private final String input;

    public FIXMEReplaceAllDots(String input) {
        this.input = input;
    }

    public String solution() {
        return input.replaceAll("\\.", "-");
    }

}
