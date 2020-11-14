package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// https://www.codewars.com/kata/5469e0798a3502f4a90005c9
public class RotateArray {

    private final Object[] input;
    private final int n;

    public RotateArray(Object[] input, int n) {
        this.input = input;
        this.n = n;
    }

    public Object[] solution() {
        List<Object> objects = Arrays.asList(input);
        Collections.rotate(objects, n);
        return objects.toArray();
    }

}
