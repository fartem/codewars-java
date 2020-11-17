package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/5545f109004975ea66000086
public class IsNDivisibleByXAndY {

    @SuppressWarnings("checkstyle:memberName")
    private final int n;

    @SuppressWarnings("checkstyle:memberName")
    private final int x;

    @SuppressWarnings("checkstyle:memberName")
    private final int y;

    public IsNDivisibleByXAndY(int n, int x, int y) {
        this.n = n;
        this.x = x;
        this.y = y;
    }

    public boolean solution() {
        return n % x == 0 && n % y == 0;
    }

}
