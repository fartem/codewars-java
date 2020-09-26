package com.smlnskgmail.jaman.codewarsjava.kyu7;

import java.util.stream.IntStream;

// https://www.codewars.com/kata/5abd66a5ccfd1130b30000a9
public class RowWeights {

    private final int[] weights;

    public RowWeights(int[] weights) {
        this.weights = weights;
    }

    public int[] solution() {
        int firstTeamScores = IntStream
                .range(0, weights.length)
                .filter(i -> i % 2 == 0)
                .map(i -> weights[i])
                .sum();
        int secondTeamScores = IntStream
                .range(0, weights.length)
                .filter(i -> i % 2 != 0)
                .map(i -> weights[i])
                .sum();
        return new int[] {
                firstTeamScores,
                secondTeamScores
        };
    }

}
