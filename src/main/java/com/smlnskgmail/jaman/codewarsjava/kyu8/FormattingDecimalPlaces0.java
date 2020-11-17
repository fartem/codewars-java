package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/5641a03210e973055a00000d
public class FormattingDecimalPlaces0 {

    private final double input;

    public FormattingDecimalPlaces0(double input) {
        this.input = input;
    }

    public double solution() {
        return Double.parseDouble(
                new java.text.DecimalFormat("##.##").format(input)
        );
    }

}
