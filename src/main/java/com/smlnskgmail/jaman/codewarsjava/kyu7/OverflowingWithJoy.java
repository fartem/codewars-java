package com.smlnskgmail.jaman.codewarsjava.kyu7;

// https://www.codewars.com/kata/55186c0f4149dd08a7000006
public class OverflowingWithJoy {

    @SuppressWarnings("checkstyle:memberName")
    private final int a;

    @SuppressWarnings("checkstyle:memberName")
    private final int b;

    public OverflowingWithJoy(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int solution() {
        return Math.multiplyExact(a, b);
    }

}
