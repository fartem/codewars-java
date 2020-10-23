package com.smlnskgmail.jaman.codewarsjava.kyu6;

// https://www.codewars.com/kata/525f47c79f2f25a4db000025
public class ValidPhoneNumber {

    private final String input;

    public ValidPhoneNumber(String input) {
        this.input = input;
    }

    public boolean solution() {
        return input.matches("\\(\\d{3}\\) \\d{3}-\\d{4}");
    }

}
