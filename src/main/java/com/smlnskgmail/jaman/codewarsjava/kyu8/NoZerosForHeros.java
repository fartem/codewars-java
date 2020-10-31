package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/570a6a46455d08ff8d001002
public class NoZerosForHeros {

    private final int input;

    public NoZerosForHeros(int input) {
        this.input = input;
    }

    public int solution() {
        String inputAsString = String.valueOf(input);
        return Integer.parseInt(
                inputAsString.replaceAll(
                        "([^0])0*$",
                        "$1"
                )
        );
    }

}
