package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// https://www.codewars.com/kata/5842df8ccbd22792a4000245
public class WriteNumberInExpandedForm {

    private final int input;

    public WriteNumberInExpandedForm(int input) {
        this.input = input;
    }

    public String solution() {
        List<String> splittedNumber = new LinkedList<>(
                Arrays.asList(
                        String.valueOf(input).split("")
                )
        );
        int splittedNumbers = splittedNumber.size() - 1;

        List<String> numbers = new LinkedList<>();
        for (int i = 0; i < splittedNumber.size(); i++) {
            int digit = Integer.parseInt(splittedNumber.get(i));
            if (digit != 0) {
                numbers.add(
                        String.format(
                                ("%d%s"),
                                digit,
                                String.join(
                                        "",
                                        Collections.nCopies(splittedNumbers - i, "0")
                                )
                        )
                );
            }
        }
        return String.join(" + ", numbers);
    }

}
