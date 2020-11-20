package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/5808e2006b65bff35500008f
public class FindThePosition {

    private final char input;

    public FindThePosition(char input) {
        this.input = input;
    }

    public String solution() {
        return "Position of alphabet: " + (input - 96);
    }

}
