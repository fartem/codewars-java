package com.smlnskgmail.jaman.codewarsjava.kyu6;

// https://www.codewars.com/kata/5679aa472b8f57fb8c000047
public class EqualSidesOfAnArray {

    private final int[] input;

    public EqualSidesOfAnArray(int[] input) {
        this.input = input;
    }

    public int solution() {
        int leftSum = 0;
        int sum = 0;
        int arrayLength = input.length;

        for (int value : input) {
            sum += value;
        }

        for (int i = 0; i < arrayLength; i++) {
            int valueAtPosition = input[i];
            sum -= valueAtPosition;
            if (leftSum == sum) {
                return i;
            }
            leftSum += valueAtPosition;
        }
        return -1;
    }

}
