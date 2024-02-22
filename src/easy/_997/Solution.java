package easy._997;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int findJudge(int n, int[][] trust) {

        Map<Integer, Integer> incoming = new HashMap<>();
        Map<Integer, Integer> outgoing = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            incoming.put(i, 0);
            outgoing.put(i, 0);
        }
        for (int[] arr : trust) {
            int l = arr[0];
            int r = arr[1];
            outgoing.merge(l, 1, Integer::sum);
            incoming.merge(r, 1, Integer::sum);
        }
        for (int i = 1; i <= n; i++) {
            if (incoming.get(i) == n - 1 && outgoing.get(i) == 0) {
                return i;
            }
        }
        return -1;
    }
}
