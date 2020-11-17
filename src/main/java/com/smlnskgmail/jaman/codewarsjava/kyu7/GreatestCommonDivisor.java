package com.smlnskgmail.jaman.codewarsjava.kyu7;

// https://www.codewars.com/kata/5500d54c2ebe0a8e8a0003fd
public class GreatestCommonDivisor {

    @SuppressWarnings("checkstyle:memberName")
    private final int x;

    @SuppressWarnings("checkstyle:memberName")
    private final int y;

    public GreatestCommonDivisor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int solution() {
        return compute(x, y);
    }

    public int compute(int x, int y) {
        return y == 0 ? x : compute(y, x % y);
    }

}
