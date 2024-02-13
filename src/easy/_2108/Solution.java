package easy._2108;

public class Solution {

    public String firstPalindrome(String[] words) {

        for (String word : words) {
            if (isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }

    private boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString().equals(s);
    }
}
