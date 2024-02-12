package medium._368;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public List<Integer> largestDivisibleSubset(int[] nums) {

        Arrays.sort(nums);
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    max = Math.max(dp[i], max);
                }
            }
        }
        List<Integer> subset = new ArrayList<>();
        int prev = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (dp[i] == max && (prev % nums[i] == 0 || prev == -1)) {
                subset.add(nums[i]);
                prev = nums[i];
                max--;
            }
        }
        return subset;
    }
}
