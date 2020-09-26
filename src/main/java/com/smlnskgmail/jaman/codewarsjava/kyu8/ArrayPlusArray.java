package com.smlnskgmail.jaman.codewarsjava.kyu8;

import java.util.Arrays;

// https://www.codewars.com/kata/5a2be17aee1aaefe2a000151
public class ArrayPlusArray {

    private final int[] firstArray;
    private final int[] secondArray;

    public ArrayPlusArray(int[] firstArray, int[] secondArray) {
        this.firstArray = firstArray;
        this.secondArray = secondArray;
    }

    public int solution() {
        return Arrays.stream(firstArray).sum() + Arrays.stream(secondArray).sum();
    }

}
