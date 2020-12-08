package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.List;

// https://www.codewars.com/kata/541629460b198da04e000bb9
public class Last {

    public static <T> T last(final List<T> list) {
        return list.get(list.size() - 1);
    }

    public static char last(final String string) {
        return string.charAt(string.length() - 1);
    }

    @SafeVarargs
    public static <T> T last(final T... list) {
        return list[list.length - 1];
    }

}
