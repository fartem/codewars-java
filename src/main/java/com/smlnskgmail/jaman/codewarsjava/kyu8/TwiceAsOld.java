package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/5b853229cfde412a470000d0
public class TwiceAsOld {

    private final int dadYears;
    private final int sonYears;

    public TwiceAsOld(int dadYears, int sonYears) {
        this.dadYears = dadYears;
        this.sonYears = sonYears;
    }

    public int solution() {
        return Math.abs(dadYears - sonYears * 2);
    }

}
