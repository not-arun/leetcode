package medium._931;

public class Solution {

    public int minFallingPathSum(int[][] matrix) {

        int size = matrix.length;
        int[][] dp = new int[size][size];
        System.arraycopy(matrix[0], 0, dp[0], 0, size);
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int min = Integer.MAX_VALUE;
                int ele = matrix[i][j];
                if (j - 1 >= 0) {
                    min = Math.min(dp[i - 1][j - 1], min);
                }
                min = Math.min(dp[i - 1][j], min);
                if (j + 1 < size) {
                    min = Math.min(dp[i - 1][j + 1], min);
                }
                dp[i][j] = min + ele;
            }
        }
        int result = dp[size - 1][0];
        for (int i = 1; i < size; i++) {
            if (dp[size - 1][i] < result) result = dp[size - 1][i];
        }
        System.gc();
        return result;
    }
}
