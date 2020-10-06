package com.smlnskgmail.jaman.codewarsjava.kyu7;

// https://www.codewars.com/kata/56a4872cbb65f3a610000026
public class RotateForAMax {

    private long input;

    public RotateForAMax(long input) {
        this.input = input;
    }

    public long solution() {
        String num = String.valueOf(input);
        for (int i = 0; i < num.length() - 1; i++) {
            num = num.substring(0, i) + num.substring(i + 1) + num.charAt(i);
            if (Long.parseLong(num) > input) {
                input = Long.parseLong(num);
            }
        }
        return input;
    }

}
