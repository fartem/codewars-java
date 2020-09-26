package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.math.BigInteger;

// https://www.codewars.com/kata/5a99a03e4a6b34bb3c000124
public class PrimorialOfANumber {

    private final int number;

    public PrimorialOfANumber(int number) {
        this.number = number;
    }

    public String solution() {
        BigInteger result = new BigInteger("1");
        for (int i = 0, j = 0; i < number;) {
            if (isPrimeNumber(j)) {
                result = result.multiply(
                        new BigInteger(
                                String.valueOf(j)
                        )
                );
                i++;
            }
            j++;
        }
        return result.toString();
    }

    private boolean isPrimeNumber(int number) {
        if (number <= 2) {
            return number == 2;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= number; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
