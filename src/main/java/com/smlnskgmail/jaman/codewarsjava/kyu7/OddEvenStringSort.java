package com.smlnskgmail.jaman.codewarsjava.kyu7;

// https://www.codewars.com/kata/580755730b5a77650500010c
public class OddEvenStringSort {

    private final String input;

    public OddEvenStringSort(String input) {
        this.input = input;
    }

    public String solution() {
        StringBuilder evens = new StringBuilder();
        StringBuilder odds = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);
            if (i % 2 == 0) {
                evens.append(symbol);
            } else {
                odds.append(symbol);
            }
        }
        return evens
                .append(" ")
                .append(odds.toString())
                .toString();
    }

}
