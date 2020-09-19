package com.smlnskgmail.jaman.codewarsjava.kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumProductTest {

    @Test
    public void fixedTests() {
        String message = "Positive numbers";
        test(
                message,
                40,
                new MaximumProduct(new int[] {5, 8}).result()
        );
        test(
                message,
                6,
                new MaximumProduct(new int[] {1, 2, 3}).result()
        );
        test(
                message,
                90,
                new MaximumProduct(new int[] {1, 5, 10, 9}).result()
        );
        test(
                message,
                48,
                new MaximumProduct(new int[] {4, 12, 3, 1, 5}).result()
        );
        test(
                message,
                6,
                new MaximumProduct(new int[] {5, 1, 2, 3, 1, 4}).result()
        );

        message = "Both positive and negative values";
        test(
                message,
                21,
                new MaximumProduct(new int[] {3, 6, -2, -5, 7, 3}).result()
        );
        test(
                message,
                50,
                new MaximumProduct(new int[] {9, 5, 10, 2, 24, -1, -48}).result()
        );
        test(
                message,
                30,
                new MaximumProduct(new int[] {5, 6, -4, 2, 3, 2, -23}).result()
        );
        test(
                message,
                -14,
                new MaximumProduct(new int[] {-23, 4, -5, 99, -27, 329, -2, 7, -921}).result()
        );
        test(
                message,
                6,
                new MaximumProduct(new int[] {5, 1, 2, 3, 1, 4}).result()
        );

        message = "Contains zeroes";
        test(
                message,
                0,
                new MaximumProduct(new int[] {1, 0, 1, 0, 1000}).result()
        );
        test(
                message,
                6,
                new MaximumProduct(new int[] {1, 2, 3, 0}).result()
        );
    }

    private void test(
            String message,
            int expected,
            int actual
    ) {
        assertEquals(message, expected, actual);
    }

}
