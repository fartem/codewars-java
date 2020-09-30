package com.smlnskgmail.jaman.codewarsjava.kyu7;

// https://www.codewars.com/kata/54ff3102c1bad923760001f3
public class VowelCount {

    private final String input;

    public VowelCount(String input) {
        this.input = input;
    }

    public int solution() {
        return input.replaceAll("(?i)[^aeiou]", "").length();
    }

}
