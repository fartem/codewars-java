package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class The12DaysOfChristmasTest {

    @Test
    public void ex() {
        final String[] linesOrig = new String[]{
                "On the 12th day of Christmas my true love gave to me",
                "12 drummers drumming,",
                "11 pipers piping,",
                "10 lords a leaping,",
                "9 ladies dancing,",
                "8 maids a milking,",
                "7 swans a swimming,",
                "6 geese a laying,",
                "5 golden rings,",
                "4 calling birds,",
                "3 French hens,",
                "2 turtle doves and",
                "a partridge in a pear tree."
        };
        final List<String> lines = new ArrayList<>(Arrays.asList(linesOrig));
        Collections.shuffle(lines);
        lines.sort(new The12DaysOfChristmas());
        assertArrayEquals(linesOrig, lines.toArray());
    }

    private String forDisplay(final List<String> lines) {
        final StringBuilder sb = new StringBuilder();
        for (String line : lines) {
            sb.append("\t").append(line).append("\n");
        }
        return sb.toString();
    }

}
