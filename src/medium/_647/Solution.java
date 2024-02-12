package medium._647;

public class Solution {

    public int countSubstrings(String s) {

        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            counter += solve(i, i, s);
            counter += solve(i, i + 1, s);
        }
        return counter;
    }

    private int solve(int l, int r, String s) {

        int counter = 0;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            counter++;
            l--;
            r++;
        }
        return counter;
    }

}
