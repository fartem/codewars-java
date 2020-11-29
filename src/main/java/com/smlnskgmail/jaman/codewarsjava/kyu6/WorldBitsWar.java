package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.math.BigInteger;

// https://www.codewars.com/kata/58865bfb41e04464240000b0
public class WorldBitsWar {

    private final int[] input;

    public WorldBitsWar(int[] input) {
        this.input = input;
    }

    public String solution() {
        int oddsResult = 0;
        int evensResult = 0;
        for (int number : input) {
            int bitCount = new BigInteger(String.valueOf(Math.abs(number))).bitCount();
            if (number % 2 != 0) {
                oddsResult += number < 0 ? -bitCount : bitCount;
            } else {
                evensResult += number < 0 ? -bitCount : bitCount;
            }
        }
        String result;
        if (oddsResult > evensResult) {
            result = "odds win";
        } else if (evensResult > oddsResult) {
            result = "evens win";
        } else {
            result = "tie";
        }
        return result;
    }

}
