package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/57126304cdbf63c6770012bd
public class IsItANumber {

    private final String input;

    public IsItANumber(String input) {
        this.input = input;
    }

    public boolean solution() {
        return input.matches("^-?[0-9]{1,12}(?:\\.[0-9]{1,100})?$");
    }

}
