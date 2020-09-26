package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// https://www.codewars.com/kata/5c4b5f06b1fd9b3fec8cb03e
public class LunarMathematicsAddition {

    private final int firstNumber;
    private final int secondNumber;

    public LunarMathematicsAddition(
            int firstNumber,
            int secondNumber
    ) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public long solution() {
        String maximumValue = String.valueOf(
                Math.max(firstNumber, secondNumber)
        );

        String minimum = String.valueOf(
                Math.min(firstNumber, secondNumber)
        );
        String minimumValue = String.join(
                "",
                Collections.nCopies(maximumValue.length() - minimum.length(), "0")
        ).concat(minimum);

        return Integer.parseInt(
                IntStream.range(0, maximumValue.length())
                        .mapToObj(value -> String.valueOf(
                                Math.max(
                                        Character.getNumericValue(maximumValue.charAt(value)),
                                        Character.getNumericValue(minimumValue.charAt(value))
                                ))
                        ).collect(Collectors.joining())
        );
    }

}
