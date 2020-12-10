package com.smlnskgmail.jaman.codewarsjava.kyu6;

// https://www.codewars.com/kata/5262119038c0985a5b00029f
public class IsANumberPrime {

    private final int input;

    public IsANumberPrime(int input) {
        this.input = input;
    }

    public boolean solution() {
        if (input <= 2) {
            return input == 2;
        }
        if (input % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= input; i += 2) {
            if (input % i == 0) {
                return false;
            }
        }
        return true;
    }

}
