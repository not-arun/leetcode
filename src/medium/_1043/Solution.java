package medium._1043;

public class Solution {

    public int maxSumAfterPartitioning(int[] arr, int k) {

        int[] memo = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {

            int curMax = Integer.MIN_VALUE;
            int maxWindow = Integer.MIN_VALUE;
            for (int j = i; i - j < k && j >= 0; --j) {
                curMax = Math.max(arr[j], curMax);
                int acc;
                if (j == 0) {
                    acc = curMax * (i - j + 1);
                } else {
                    acc = curMax * (i - j + 1) + memo[j - 1];
                }
                maxWindow = Math.max(maxWindow, acc);
            }
            memo[i] = maxWindow;
        }
        return memo[arr.length - 1];
    }
}
