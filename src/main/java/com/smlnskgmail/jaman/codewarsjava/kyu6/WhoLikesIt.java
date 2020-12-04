package com.smlnskgmail.jaman.codewarsjava.kyu6;

// https://www.codewars.com/kata/5266876b8f4bf2da9b000362/
public class WhoLikesIt {

    private final String[] input;

    public WhoLikesIt(String... input) {
        this.input = input;
    }

    public String solution() {
        switch (input.length) {
            case 0:
                return "no one likes this";
            case 1:
                return String.format(
                        "%s likes this",
                        input[0]
                );
            case 2:
                return String.format(
                        "%s and %s like this",
                        input[0],
                        input[1]
                );
            case 3:
                return String.format(
                        "%s, %s and %s like this",
                        input[0],
                        input[1],
                        input[2]
                );
            default:
                return String.format(
                        "%s, %s and %s others like this",
                        input[0],
                        input[1],
                        input.length - 2
                );
        }
    }

}
