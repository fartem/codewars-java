package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/57d814e4950d8489720008db
public class NthPower {

    private final int[] array;
    private final int number;

    public NthPower(int[] array, int number) {
        this.array = array;
        this.number = number;
    }

    public int solution() {
        return array.length - 1 < number ? -1 : (int) Math.pow(array[number], number);
    }

}
