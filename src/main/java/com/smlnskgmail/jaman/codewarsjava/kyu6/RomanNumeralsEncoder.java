package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.util.TreeMap;

// https://www.codewars.com/kata/51b62bf6a9c58071c600001b
public class RomanNumeralsEncoder {

    private static final TreeMap<Integer, String> romanNumerals = new TreeMap<>();

    static {

        romanNumerals.put(1000, "M");
        romanNumerals.put(900, "CM");
        romanNumerals.put(500, "D");
        romanNumerals.put(400, "CD");
        romanNumerals.put(100, "C");
        romanNumerals.put(90, "XC");
        romanNumerals.put(50, "L");
        romanNumerals.put(40, "XL");
        romanNumerals.put(10, "X");
        romanNumerals.put(9, "IX");
        romanNumerals.put(5, "V");
        romanNumerals.put(4, "IV");
        romanNumerals.put(1, "I");

    }

    private final int input;

    public RomanNumeralsEncoder(int input) {
        this.input = input;
    }

    public String solution() {
        return getRomanNumber(input);
    }

    private String getRomanNumber(int n) {
        int value = romanNumerals.floorKey(n);
        if (n == value) {
            return romanNumerals.get(n);
        }
        return romanNumerals.get(value) + getRomanNumber(n - value);
    }

}
