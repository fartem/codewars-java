package com.smlnskgmail.jaman.codewarsjava.kyu6;

import java.util.*;

// https://www.codewars.com/kata/554910d77a3582bbe300009c
public class WhoWonTheElection {

    private final List<String> input;

    public WhoWonTheElection(List<String> input) {
        this.input = input;
    }

    public String solution() {
        Map<String, Integer> result = new HashMap<>();
        input.forEach(b -> result.merge(b, 1, Integer::sum));
        String winner = Collections.max(
                result.entrySet(),
                Comparator.comparingInt(Map.Entry::getValue)
        ).getKey();
        int votesForWinner = result.get(winner);
        if (result.values().stream().filter(i -> i == votesForWinner).count() > 1) {
            return null;
        }
        return (votesForWinner <= input.size() / 2) ? null : winner;
    }

}
