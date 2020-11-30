package com.smlnskgmail.jaman.codewarsjava.kyu5;

// https://www.codewars.com/kata/526989a41034285187000de4
public class CountIPAddresses {

    private final String start;
    private final String end;

    public CountIPAddresses(String start, String end) {
        this.start = start;
        this.end = end;
    }

    public long solution() {
        return (int) (convertToLong(end) - convertToLong(start));
    }

    private long convertToLong(String ip) {
        long res = 0;
        for (String s : ip.split("[.]") ) {
            res = res * 256 + Long.parseLong(s);
        }
        return res;
    }

}
