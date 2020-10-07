package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/56d49587df52101de70011e4
public class LeonardoDicaprioAndOscars {

    private final int input;

    public LeonardoDicaprioAndOscars(int input) {
        this.input = input;
    }

    public String solution() {
        switch (input) {
            case 86:
                return "Not even for Wolf of wallstreet?!";
            case 88:
                return "Leo finally won the oscar! Leo is happy";
            default:
                return input < 88 ? "When will you give Leo an Oscar?" : "Leo got one already!";
        }
    }

}
