package com.smlnskgmail.jaman.codewarsjava.kyu6;

// https://www.codewars.com/kata/569d488d61b812a0f7000015
public class DataReverse {

    private final int[] input;

    public DataReverse(int[] input) {
        this.input = input;
    }

    public int[] solution() {
        int[] result = new int[input.length];
        for (int i = input.length - 8, j = 0; i >= 0; i -= 8, j += 8) {
            System.arraycopy(input, i, result, j, 8);
        }
        return result;
    }

}
