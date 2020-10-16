package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/57eae20f5500ad98e50002c5
public class RemoveStringSpaces {

    private final String input;

    public RemoveStringSpaces(String input) {
        this.input = input;
    }

    public String solution() {
        return input.replaceAll(" ", "");
    }

}
