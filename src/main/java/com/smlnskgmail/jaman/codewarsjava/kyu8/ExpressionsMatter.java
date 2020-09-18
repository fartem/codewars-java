package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/5ae62fcf252e66d44d00008e
public class ExpressionsMatter {

    private final int a;
    private final int b;
    private final int c;

    public ExpressionsMatter(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int result() {
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
