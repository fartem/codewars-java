package com.smlnskgmail.jaman.codewarsjava.kyu7;

// https://www.codewars.com/kata/5d50e3914861a500121e1958
public class AlphabeticalAddition {

    private final String[] input;

    public AlphabeticalAddition(String... input) {
        this.input = input;
    }

    public String result() {
        int sum = String
                .join("", input)
                .chars()
                .map(c -> c - 96)
                .sum();
        int alphabetSize = 26;
        if (sum > alphabetSize) {
            while (sum > alphabetSize) {
                sum = Math.abs(sum - alphabetSize);
            }
        } else if (sum == 0) {
            sum = alphabetSize;
        }
        return String.valueOf((char) (sum + 96));
    }

}
