package com.smlnskgmail.jaman.codewarsjava.kyu7;

// https://www.codewars.com/kata/583f158ea20cfcbeb400000a
public class MakeAFunctionThatDoesArithmetic {

    private final int a;
    private final int b;
    private final String operator;

    public MakeAFunctionThatDoesArithmetic(int a, int b, String operator) {
        this.a = a;
        this.b = b;
        this.operator = operator;
    }

    public int solution() {
        switch (operator) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            default:
                return a / b;
        }
    }

}
