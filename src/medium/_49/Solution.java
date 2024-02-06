package medium._49;

import java.util.*;

public class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> sortedVsAnagram = new HashMap<>();
        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);
            if (!sortedVsAnagram.containsKey(sortedStr)) {
                sortedVsAnagram.put(sortedStr, new ArrayList<>());
            }
            sortedVsAnagram.get(sortedStr).add(str);
        }
        return new ArrayList<>(sortedVsAnagram.values());
    }
}
