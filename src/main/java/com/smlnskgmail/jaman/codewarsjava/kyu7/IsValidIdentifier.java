package com.smlnskgmail.jaman.codewarsjava.kyu7;

// https://www.codewars.com/kata/563a8656d52a79f06c00001f
public class IsValidIdentifier {

    private final String input;

    public IsValidIdentifier(String input) {
        this.input = input;
    }

    public boolean solution() {
        return input.length() > 1
                && input.substring(0, 1).matches("^[a-zA-Z_$]*$")
                && input.substring(1).matches("^[a-zA-Z0-9_$]*$");
    }

}
