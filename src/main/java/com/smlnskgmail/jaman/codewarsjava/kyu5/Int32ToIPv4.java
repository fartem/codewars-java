package com.smlnskgmail.jaman.codewarsjava.kyu5;

import java.net.InetAddress;
import java.net.UnknownHostException;

// https://www.codewars.com/kata/52e88b39ffb6ac53a400022e
public class Int32ToIPv4 {

    private final long input;

    public Int32ToIPv4(long input) {
        this.input = input;
    }

    public String solution() {
        try {
            return InetAddress.getByName(String.valueOf(input)).getHostAddress();
        } catch (UnknownHostException e) {
            return "0.0.0.0";
        }
    }

}
