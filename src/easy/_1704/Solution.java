package easy._1704;

public class Solution {

    public boolean halvesAreAlike(String s) {

        int firstHalf = 0;
        int secondHalf = 0;
        int half = s.length() / 2;
        char[] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if ("aeiouAEIOU".indexOf(charArray[i]) != -1) {
                if (i < half) firstHalf++;
                else secondHalf++;
            }
        }
        return firstHalf == secondHalf;
    }
}
