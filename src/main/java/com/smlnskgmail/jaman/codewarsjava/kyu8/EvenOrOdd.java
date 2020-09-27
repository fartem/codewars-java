package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/53da3dbb4a5168369a0000fe
public class EvenOrOdd {

    private final int input;

    public EvenOrOdd(int input) {
        this.input = input;
    }

    public String solution() {
        return input % 2 == 0 ? "Even" : "Odd";
    }

}
