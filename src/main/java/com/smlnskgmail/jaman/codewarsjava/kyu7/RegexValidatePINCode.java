package com.smlnskgmail.jaman.codewarsjava.kyu7;

// https://www.codewars.com/kata/55f8a9c06c018a0d6e000132
public class RegexValidatePINCode {

    private final String input;

    public RegexValidatePINCode(String input) {
        this.input = input;
    }

    public boolean solution() {
        return isValidPinSize(input) && isValidPin(input);
    }

    private boolean isValidPinSize(String pin) {
        return pin.length() == 4 || pin.length() == 6;
    }

    private boolean isValidPin(String pin) {
        return pin.split("^[0-9]+").length == 0;
    }

}
