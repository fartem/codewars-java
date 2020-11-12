package com.smlnskgmail.jaman.codewarsjava.kyu6;

// https://www.codewars.com/kata/5277c8a221e209d3f6000b56
public class ValidBraces {

    private String input;

    public ValidBraces(String input) {
        this.input = input;
    }

    public boolean solution() {
        while (input.contains("{}")
                || input.contains("()")
                || input.contains("[]")) {
            input = input
                    .replace("{}", "")
                    .replace("()", "")
                    .replace("[]", "");
        }
        return input.length() == 0;
    }

}
