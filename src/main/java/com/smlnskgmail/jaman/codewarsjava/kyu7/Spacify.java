package com.smlnskgmail.jaman.codewarsjava.kyu7;

// https://www.codewars.com/kata/57f8ee485cae443c4d000127
public class Spacify {

    private final String input;

    public Spacify(String input) {
        this.input = input;
    }

    public String solution() {
        return String.join(" ", input.split("(?!^)"));
    }

}
