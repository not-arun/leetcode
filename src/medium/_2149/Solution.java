package medium._2149;

public class Solution {

    public int[] rearrangeArray(int[] nums) {

        int posIndex = 0;
        int negIndex = 1;
        int[] res = new int[nums.length];
        for (int num : nums) {
            if (num > 0) {
                res[posIndex] = num;
                posIndex += 2;
            } else {
                res[negIndex] = num;
                negIndex += 2;
            }
        }
        return res;
    }
}
