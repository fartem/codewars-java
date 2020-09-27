package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/53dc23c68a0c93699800041d
public class SentenceSmash {

    private final String[] input;

    public SentenceSmash(String[] input) {
        this.input = input;
    }

    public String solution() {
        return String.join(" ", input);
    }

}
