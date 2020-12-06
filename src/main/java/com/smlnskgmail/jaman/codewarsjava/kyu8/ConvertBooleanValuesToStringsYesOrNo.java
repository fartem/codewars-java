package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/53369039d7ab3ac506000467
public class ConvertBooleanValuesToStringsYesOrNo {

    private final boolean input;

    public ConvertBooleanValuesToStringsYesOrNo(boolean input) {
        this.input = input;
    }

    public String solution() {
        return input ? "Yes" : "No";
    }

}
