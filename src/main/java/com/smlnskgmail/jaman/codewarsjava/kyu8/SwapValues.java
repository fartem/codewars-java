package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/5388f0e00b24c5635e000fc6
public class SwapValues {

    public final Object[] input;

    public SwapValues(Object[] input) {
        this.input = input;
    }

    public void swapValues() {
        Object[] args = new Object[]{input[0], input[1]};
        Object temp = args[0];
        input[0] = args[1];
        input[1] = temp;
    }

}
