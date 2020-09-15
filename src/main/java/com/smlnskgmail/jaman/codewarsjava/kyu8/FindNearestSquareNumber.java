package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/5a805d8cafa10f8b930005ba
public class FindNearestSquareNumber {

    private final int number;

    public FindNearestSquareNumber(int number) {
        this.number = number;
    }

    public int result() {
        return (int) Math.pow(
                Math.round(Math.sqrt(number)),
                2
        );
    }

}
