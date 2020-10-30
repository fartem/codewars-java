package com.smlnskgmail.jaman.codewarsjava.kyu8;

// https://www.codewars.com/kata/568dcc3c7f12767a62000038
public class L1SetAlarm {

    private final boolean employed;
    private final boolean vacation;

    public L1SetAlarm(boolean employed, boolean vacation) {
        this.employed = employed;
        this.vacation = vacation;
    }

    public boolean solution() {
        return employed && !vacation;
    }

}
