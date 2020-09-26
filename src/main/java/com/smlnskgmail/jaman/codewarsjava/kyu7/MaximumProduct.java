package com.smlnskgmail.jaman.codewarsjava.kyu7;

// https://www.codewars.com/kata/5a4138acf28b82aa43000117
public class MaximumProduct {

    private final int[] array;

    public MaximumProduct(int[] array) {
        this.array = array;
    }

    public int solution() {
        int maximumProduct = Integer.MIN_VALUE;
        for (int i = 0; i < array.length - 1; i++) {
            int product = array[i] * array[i + 1];
            if (product > maximumProduct) {
                maximumProduct = product;
            }
        }
        return maximumProduct;
    }

}
