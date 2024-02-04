package hard._76;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public String minWindow(String s, String t) {

        if (t.isEmpty()) return "";
        Map<Character, Integer> freq = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();
        for (Character c : t.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        int have = 0;
        int need = t.length();
        char[] charArray = s.toCharArray();
        int resStartIndex = -1;
        int resEndIndex = -1;
        int resLen = Integer.MAX_VALUE;
        int left = 0;
        for (int right = 0; right < charArray.length; right++) {
            Character ch = charArray[right];
            if (freq.containsKey(ch)) {
                window.put(ch, window.getOrDefault(ch, 0) + 1);
                if (freq.get(ch) >= (window.get(ch))) {
                    have++;
                }
            }
            while (have == need) {
                if (right - left + 1 < resLen) {
                    resStartIndex = left;
                    resEndIndex = right;
                    resLen = right - left + 1;
                }
                char leftChar = s.charAt(left);
                if (freq.containsKey(leftChar)) {
                    window.put(leftChar, window.getOrDefault(leftChar, 0) - 1);
                    if (freq.get(leftChar) > (window.get(leftChar))) {
                        have--;
                    }
                }
                left++;
            }
        }
        return resStartIndex == -1 ? "" :
                s.substring(resStartIndex, resEndIndex + 1);
    }
}
