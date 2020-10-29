package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/557cd6882bfa3c8a9f0000c1
public class ParseNiceIntFromCharProblem {

    private final String input;

    public ParseNiceIntFromCharProblem(String input) {
        this.input = input;
    }

    public int solution() {
        return Character.getNumericValue(input.charAt(0));
    }

}
