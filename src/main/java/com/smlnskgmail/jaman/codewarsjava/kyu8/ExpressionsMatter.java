package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/5ae62fcf252e66d44d00008e
public class ExpressionsMatter {

    @SuppressWarnings("checkstyle:memberName")
    private final int a;

    @SuppressWarnings("checkstyle:memberName")
    private final int b;

    @SuppressWarnings("checkstyle:memberName")
    private final int c;

    public ExpressionsMatter(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int solution() {
        return Math.max(
                Math.max(
                        a + b + c,
                        a * b * c
                ),
                Math.max(
                        a * (b + c),
                        (a + b) * c
                )
        );
    }

}
