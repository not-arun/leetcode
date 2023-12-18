package medium._1910;

class Solution {

    public String removeOccurrences(String s, String part) {

        if (!s.contains(part)) {
            return s;
        }
        int partLen = part.length();
        for (int i = 0; i <= s.length() - partLen; i++) {
            String sub = s.substring(i, i + partLen);
            if (sub.equals(part)) {
                s = s.substring(0, i) + s.substring(i + partLen);
                return removeOccurrences(s, part);
            }
        }
        return "";
    }
}
