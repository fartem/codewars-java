package com.smlnskgmail.jaman.codewarsjava.kyu7;

// https://www.codewars.com/kata/5c44b0b200ce187106452139
public class HowManyArguments {

    private final Object[] input;

    public HowManyArguments(Object... input) {
        this.input = input;
    }

    public int result() {
        return input.length;
    }

}
