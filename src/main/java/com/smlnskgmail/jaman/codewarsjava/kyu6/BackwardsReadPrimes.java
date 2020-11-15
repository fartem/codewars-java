package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.util.LinkedList;
import java.util.List;

// https://www.codewars.com/kata/5539fecef69c483c5a000015
public class BackwardsReadPrimes {

    private final long from;
    private final long to;

    public BackwardsReadPrimes(long from, long to) {
        this.from = from;
        this.to = to;
    }

    public String solution() {
        List<String> primeNumbers = new LinkedList<>();
        for (long i = from; i <= to; i++) {
            long reversedNumber = Long.parseLong(
                    new StringBuilder(String.valueOf(i))
                            .reverse()
                            .toString()
            );
            if (i != reversedNumber
                    && isPrimeNumber(i)
                    && isPrimeNumber(reversedNumber)) {
                primeNumbers.add(String.valueOf(i));
            }
        }
        return String.join(" ", primeNumbers);
    }

    private boolean isPrimeNumber(long number) {
        for (long i = 2; 2 * i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
