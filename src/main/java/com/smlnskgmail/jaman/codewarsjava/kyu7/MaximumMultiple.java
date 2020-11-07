package com.smlnskgmail.jaman.codewarsjava.kyu7;

// https://www.codewars.com/kata/5aba780a6a176b029800041c
public class MaximumMultiple {

    private final int divisor;
    private final int bound;

    public MaximumMultiple(
            int divisor,
            int bound
    ) {
        this.divisor = divisor;
        this.bound = bound;
    }

    public int solution() {
        return bound / divisor * divisor;
    }

}
