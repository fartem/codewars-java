package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/55ad04714f0b468e8200001c
public class GetCharacterFromASCIIValue {

    private final int input;

    public GetCharacterFromASCIIValue(int input) {
        this.input = input;
    }

    public char solution() {
        return (char) input;
    }

}
