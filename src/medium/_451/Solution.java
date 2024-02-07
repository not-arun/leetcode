package medium._451;

import java.util.*;

public class Solution {

    public String frequencySort(String s) {

        Map<Character, Integer> charVsFreq = new HashMap<>();
        for (char c : s.toCharArray()) {
            charVsFreq.put(c, charVsFreq.getOrDefault(c, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> entries = new ArrayList<>(charVsFreq.entrySet());
        entries.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));
        StringBuilder builder = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : entries) {
            builder.append(String.valueOf(entry.getKey()).repeat(Math.max(0, entry.getValue())));
        }
        return builder.toString();
    }
}
