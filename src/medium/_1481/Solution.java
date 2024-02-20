package medium._1481;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public int findLeastNumOfUniqueInts(int[] arr, int k) {

        Map<Integer, Integer> numVsFreq = new HashMap<>();
        for (int num : arr) {
            numVsFreq.merge(num, 1, Integer::sum);
        }
        List<Integer> freq = numVsFreq.values().stream().sorted().toList();
        int res = freq.size();
        for (int f : freq) {
            if (f <= k) {
                res -= 1;
                k -= f;
            } else {
                return res;
            }
        }
        return res;
    }
}
