package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.util.HashMap;
import java.util.Map;

// https://www.codewars.com/kata/585d7d5adb20cf33cb000235
public class FindTheUniqueNumber {

    private final double[] input;

    public FindTheUniqueNumber(double[] input) {
        this.input = input;
    }

    public double solution() {
        Map<Double, Integer> uniqueNumbers = new HashMap<>();
        for (double number : input) {
            uniqueNumbers.merge(number, 1, Integer::sum);
        }

        double uniqueNumber = 0.0;
        for (Map.Entry<Double, Integer> entry : uniqueNumbers.entrySet()) {
            if (entry.getValue() == 1) {
                uniqueNumber = entry.getKey();
            }
        }
        return uniqueNumber;
    }

}
