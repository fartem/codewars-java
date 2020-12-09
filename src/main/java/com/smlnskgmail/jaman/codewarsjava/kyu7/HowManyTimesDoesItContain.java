package com.smlnskgmail.jaman.codewarsjava.kyu7;

// https://www.codewars.com/kata/584466950d3bedb9b300001f
public class HowManyTimesDoesItContain {

    private final String string;
    private final char symbol;

    public HowManyTimesDoesItContain(String string, char symbol) {
        this.string = string;
        this.symbol = symbol;
    }

    public int solution() {
        return (int) string.chars().filter(i -> i == symbol).count();
    }

}
