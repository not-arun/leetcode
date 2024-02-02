package medium._1291;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public List<Integer> sequentialDigits(int low, int high) {

        List<Integer> res = new ArrayList<>();
        String sequence = "123456789";
        for (int i = 2; i <= 9; i++) {
            for (int j = 0; j < sequence.length() && i + j <= sequence.length(); j++) {
                String substring = sequence.substring(j, i + j);
                int val = Integer.parseInt(substring);
                if (val >= low && val <= high) {
                    res.add(val);
                }
            }
        }
        return res;
    }
}
