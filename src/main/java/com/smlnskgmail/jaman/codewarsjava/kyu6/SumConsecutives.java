package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.util.ArrayList;
import java.util.List;

// https://www.codewars.com/kata/55eeddff3f64c954c2000059
public class SumConsecutives {

    private final List<Integer> input;

    public SumConsecutives(List<Integer> input) {
        this.input = input;
    }

    public List<Integer> solution() {
        List<Integer> result = new ArrayList<>();
        int currentNumber = input.get(0);
        int sum = currentNumber;
        for (int i = 1; i < input.size(); i++) {
            int numberAtPosition = input.get(i);
            if (currentNumber == numberAtPosition) {
                sum += numberAtPosition;
            } else {
                result.add(sum);
                if (i != input.size() - 1) {
                    currentNumber = numberAtPosition;
                    sum = currentNumber;
                } else {
                    result.add(numberAtPosition);
                }
            }
        }
        return result;
    }

}
