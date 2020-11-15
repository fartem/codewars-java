package com.smlnskgmail.jaman.codewarsjava.kyu4;

import java.math.BigInteger;

// https://www.codewars.com/kata/596d34df24a04ee1e3000a25
public class CountOnesInASegment {

    private final long left;
    private final long right;

    public CountOnesInASegment(long left, long right) {
        this.left = left;
        this.right = right;
    }

    public BigInteger solution() {
        return countOnes(right).subtract(countOnes(left - 1));
    }

    private BigInteger countOnes(long right) {
        if (right == 0) {
            return BigInteger.valueOf(0);
        }
        int size = (Long.toBinaryString(right).length()) - 1;
        long power = (long) 1 << size;
        return BigInteger
                .valueOf(size)
                .multiply(BigInteger.valueOf(power / 2))
                .add(BigInteger.valueOf(1 + right - power))
                .add(countOnes(right - power));
    }

}
