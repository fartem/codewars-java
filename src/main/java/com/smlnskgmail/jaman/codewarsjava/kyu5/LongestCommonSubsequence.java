package com.smlnskgmail.jaman.codewarsjava.kyu5;

// https://www.codewars.com/kata/52756e5ad454534f220001ef
public class LongestCommonSubsequence {

    private final String firstString;
    private final String secondString;

    public LongestCommonSubsequence(
            String firstString,
            String secondString
    ) {
        this.firstString = firstString;
        this.secondString = secondString;
    }

    public String solution() {
        int m = firstString.length();
        int n = secondString.length();
        int[][] nums = new int[m + 1][n + 1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                nums[i][j] = nums[i - 1][j - 1]
                        + (firstString.charAt(i - 1) == secondString.charAt(j - 1) ? 1 : 0);
                nums[i][j] = Math.max(nums[i][j], nums[i - 1][j]);
                nums[i][j] = Math.max(nums[i][j], nums[i][j - 1]);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (nums[m][i] - nums[m][i - 1] == 1) {
                sb.append(secondString.charAt(i - 1));
            }
        }
        return sb.toString();
    }

}
