package com.smlnskgmail.jaman.codewarsjava.kyu6;

// https://www.codewars.com/kata/551af235ac044763f2000448
public class OverflowingWithLonging {

    private final long first;
    private final long second;

    public OverflowingWithLonging(long first, long second) {
        this.first = first;
        this.second = second;
    }

    public long solution() {
        return Math.multiplyExact(first, second);
    }

}
