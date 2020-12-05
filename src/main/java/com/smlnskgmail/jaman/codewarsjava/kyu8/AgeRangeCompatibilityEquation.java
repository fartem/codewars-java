package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/5803956ddb07c5c74200144e
public class AgeRangeCompatibilityEquation {

    private final int input;

    public AgeRangeCompatibilityEquation(int input) {
        this.input = input;
    }

    public String solution() {
        if (input < 14) {
            return String.format(
                    "%d-%d",
                    (int) (input - 0.10 * input),
                    (int) (input + 0.10 * input)
            );
        }
        return String.format(
                "%s-%s",
                input / 2 + 7,
                (input - 7) * 2
        );
    }

}
