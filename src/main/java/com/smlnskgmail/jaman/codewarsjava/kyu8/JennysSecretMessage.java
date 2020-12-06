package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/55225023e1be1ec8bc000390
public class JennysSecretMessage {

    private final String input;

    public JennysSecretMessage(String input) {
        this.input = input;
    }

    public String solution() {
        return input.equals("Johnny")
                ? "Hello, my love!"
                : String.format("Hello, %s!", input);
    }

}
