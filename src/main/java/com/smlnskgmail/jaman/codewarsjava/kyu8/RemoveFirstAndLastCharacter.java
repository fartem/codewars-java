package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0
public class RemoveFirstAndLastCharacter {

    private final String input;

    public RemoveFirstAndLastCharacter(String input) {
        this.input = input;
    }

    public String solution() {
        return input.substring(1, input.length() - 1);
    }

}
