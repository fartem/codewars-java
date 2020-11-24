package com.smlnskgmail.jaman.codewarsjava.kyu5;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

// https://www.codewars.com/kata/52685f7382004e774f0001f7
public class HumanReadableTime {

    private final int input;

    public HumanReadableTime(int input) {
        this.input = input;
    }

    public String solution() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, input);

        Hours hours = new Hours((int) TimeUnit.SECONDS.toHours(input));
        Minutes minutes = new Minutes(calendar.get(Calendar.MINUTE));
        Seconds seconds = new Seconds(calendar.get(Calendar.SECOND));

        return String.format(
                "%s:%s:%s",
                hours,
                minutes,
                seconds
        );
    }

    private static class Hours {

        private final int value;

        Hours(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value / 10 > 0
                    ? String.valueOf(value)
                    : "0" + value;
        }

    }

    private static class Minutes {

        private final int value;

        Minutes(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value / 10 > 0
                    ? String.valueOf(value)
                    : "0" + value;
        }

    }

    private static class Seconds {

        private final int value;

        Seconds(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return value / 10 > 0
                    ? String.valueOf(value)
                    : "0" + value;
        }

    }

}
