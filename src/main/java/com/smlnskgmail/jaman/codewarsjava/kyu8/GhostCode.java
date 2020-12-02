package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/570184a95594a091150000a0
public class GhostCode {

    private final String input;

    public GhostCode(String input) {
        this.input = input;
    }

    public String solution() {
        if (input == null || input.equals("")) {
            return "Hello world!";
        } else {
            return "Hello my name is " + input;
        }
    }

}
