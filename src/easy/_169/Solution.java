package easy._169;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int majorityElement(int[] nums) {

        Map<Integer, Integer> numVsFreq = new HashMap<>();
        for (int num : nums) {
            Integer prevFreq = numVsFreq.getOrDefault(num, 0);
            if (prevFreq + 1 > nums.length / 2) {
                return num;
            }
            numVsFreq.put(num, prevFreq + 1);
        }
        return -1;
    }
}
