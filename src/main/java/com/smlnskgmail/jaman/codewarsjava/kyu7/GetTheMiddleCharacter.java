package com.smlnskgmail.jaman.codewarsjava.kyu7;

// https://www.codewars.com/kata/56747fd5cb988479af000028
public class GetTheMiddleCharacter {

    private final String input;

    public GetTheMiddleCharacter(String input) {
        this.input = input;
    }

    public String solution() {
        int inputLength = input.length();
        return inputLength % 2 == 0
                ? input.substring(inputLength / 2 - 1, inputLength / 2 + 1)
                : String.valueOf(input.charAt(inputLength / 2));
    }

}
