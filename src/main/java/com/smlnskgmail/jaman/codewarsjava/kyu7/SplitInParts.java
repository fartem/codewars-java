package com.smlnskgmail.jaman.codewarsjava.kyu7;

// https://www.codewars.com/kata/5650ab06d11d675371000003
public class SplitInParts {

    private final String string;
    private final int partLength;

    public SplitInParts(
            String string,
            int partLength
    ) {
        this.string = string;
        this.partLength = partLength;
    }

    public String solution() {
        String pattern = String.format("(?<=\\G.{%s})", partLength);
        return String.join(" ", string.split(pattern));
    }

}
