package com.smlnskgmail.jaman.codewarsjava.kyu6;

// https://www.codewars.com/kata/5a24254fe1ce0ec2eb000078
public class SimpleStringIndices {

    private final String input;
    private final int indexOfStart;

    public SimpleStringIndices(
            String input,
            int indexOfStart
    ) {
        this.input = input;
        this.indexOfStart = indexOfStart;
    }

    public int result() {
        int openBrackets = 0;
        if (!(input.charAt(indexOfStart)== '(')) {
            return -1;
        }
        for (int i = indexOfStart; i < input.length(); i++) {
            if (input.charAt(i) =='(') {
                openBrackets++;
            }
            if (input.charAt(i) ==')') {
                openBrackets--;
            }
            if (openBrackets == 0) {
                return i;
            }
        }
        return -1;
    }

}
