package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.util.Arrays;

public class DashatizeIt {

    private final int input;

    public DashatizeIt(int input) {
        this.input = input;
    }

    public String solution() {
        boolean previousOdd = false;
        StringBuilder result = new StringBuilder();
        int[] digits = Arrays
                .stream(String.valueOf(input).split(""))
                .filter(s -> Character.isDigit(s.charAt(0)))
                .mapToInt(Integer::valueOf)
                .toArray();
        for (int i = 0; i < digits.length; i++) {
            int j = digits[i];
            if (j % 2 != 0) {
                result.append("-");
                result.append(j);
                previousOdd = true;
            } else {
                if (previousOdd) {
                    previousOdd = false;
                    result.append("-");
                }
                result.append(j);
            }
        }
        String output = result.toString();
        return output.startsWith("-") ? output.substring(1) : output;
    }

}
