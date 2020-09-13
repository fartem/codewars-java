package com.smlnskgmail.jaman.codewarsjava.kyu7;

// https://www.codewars.com/kata/5a53f300d8e145df7f000497
public class FIXMELetsSplitThisJoins {

    private final String joins;

    public FIXMELetsSplitThisJoins(String joins) {
        this.joins = joins;
    }

    public String[] result() {
        return joins.isEmpty()
                ? new String[0]
                : joins.split("\\.", -1);
    }

}
