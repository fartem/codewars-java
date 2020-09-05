package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097
public class CenturyFromYear {

    private final int year;

    public CenturyFromYear(int year) {
        this.year = year;
    }

    public int result() {
        return (year + 99) / 100;
    }

}
