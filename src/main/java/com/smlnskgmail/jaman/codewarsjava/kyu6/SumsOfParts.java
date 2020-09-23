package com.smlnskgmail.jaman.codewarsjava.kyu6;

// https://www.codewars.com/kata/5ce399e0047a45001c853c2b
public class SumsOfParts {

    private final int[] input;

    public SumsOfParts(int[] input) {
        this.input = input;
    }

    public int[] result() {
        int[] result = new int[input.length + 1];
        int counter = 0;
        for (int i = input.length - 1; i >= 0; i--) {
            counter = counter + input[i];
            result[i] = counter;
        }
        return result;
    }

}
