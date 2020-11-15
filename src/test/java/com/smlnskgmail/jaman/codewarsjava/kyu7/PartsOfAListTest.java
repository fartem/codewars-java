package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class PartsOfAListTest {

    @Test
    public void test() {
        assertEquals(
                Arrays.deepToString(
                        new PartsOfAList(new String[]{"cdIw", "tzIy", "xDu", "rThG"}).solution()
                ),
                "[[cdIw, tzIy xDu rThG], [cdIw tzIy, xDu rThG], [cdIw tzIy xDu, rThG]]"
        );
        assertEquals(
                Arrays.deepToString(
                        new PartsOfAList(new String[]{"I", "wish", "I", "hadn't", "come"}).solution()
                ),
                "[[I, wish I hadn't come], [I wish, I hadn't come], [I wish I, hadn't come], [I wish I hadn't, come]]"
        );
        assertEquals(
                Arrays.deepToString(
                        new PartsOfAList(new String[]{"vJQ", "anj", "mQDq", "sOZ"}).solution()
                ),
                "[[vJQ, anj mQDq sOZ], [vJQ anj, mQDq sOZ], [vJQ anj mQDq, sOZ]]"
        );
    }

}
