package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SplitInPartsTest {

    @Test
    public void test() {
        assertEquals(
                new SplitInParts(
                        "supercalifragilisticexpialidocious",
                        3
                ).solution(),
                "sup erc ali fra gil ist ice xpi ali doc iou s"
        );
        assertEquals(
                new SplitInParts("HelloKata", 3).solution(),
                "Hel loK ata"
        );
        assertEquals(
                new SplitInParts("HelloKata", 1).solution(),
                "H e l l o K a t a"
        );
        assertEquals(
                new SplitInParts("HelloKata", 9).solution(),
                "HelloKata"
        );
    }

}
