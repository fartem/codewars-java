package com.smlnskgmail.jaman.codewarsjava.kyu7;

// https://www.codewars.com/kata/55960bbb182094bc4800007b
public class InsertDashes {

    private final int input;

    public InsertDashes(int input) {
        this.input = input;
    }

    public String solution() {
        StringBuilder result = new StringBuilder();
        String[] digits = String.valueOf(input).split("");
        for (int i = 0; i < digits.length; i++) {
            int digit = Integer.parseInt(digits[i]);
            if (digit % 2 != 0) {
                if (i - 1 >= 0) {
                    int additionalDigit = Integer.parseInt(digits[i - 1]);
                    if (additionalDigit % 2 != 0) {
                        result.append("-").append(digit);
                    } else {
                        result.append(digit);
                    }
                } else {
                    result.append(digit);
                }
            } else {
                result.append(digit);
            }
        }
        return result.toString();
    }

}
