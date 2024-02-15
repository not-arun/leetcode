package medium._2971;

import java.util.Arrays;

public class Solution {

    public long largestPerimeter(int[] nums) {

        Arrays.sort(nums);
        long acc = 0;
        long res = -1;
        for (int num : nums) {
            if (acc > num) {
                res = acc + num;
            }
            acc += num;
        }
        return res;
    }
}
