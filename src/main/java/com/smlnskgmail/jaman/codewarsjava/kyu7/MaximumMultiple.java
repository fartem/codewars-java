package com.smlnskgmail.jaman.codewarsjava.kyu7;

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
