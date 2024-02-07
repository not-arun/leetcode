package medium._451;

import java.util.ArrayList;
import java.util.List;

public class AlternativeSolution {

    private record Pair<K,V>(K key, V val) {
    }

    public static String frequencySort(String s) {

        int[] freq = new int[75]; // 0(ASCII - 48) to z(ASCII - 122)
        char[] chars = s.toCharArray();
        for (char aChar : chars) {
            freq[aChar - '0']++;
        }
        List<Pair<Integer, Integer>> charVsFreq = new ArrayList<>();
        for (int i = 0; i < freq.length; i++) {
            charVsFreq.add(new Pair<>(i, freq[i]));
        }
        charVsFreq.sort((a, b) -> b.val() - a.val());
        StringBuilder builder = new StringBuilder();
        for (Pair<Integer, Integer> pair : charVsFreq) {
            char c = (char) (pair.key() + '0');
            builder.append(String.valueOf(c).repeat(Math.max(0, pair.val())));
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(frequencySort("tree"));
    }
}
