package hard._1463;

import java.util.Arrays;

public class Solution {

    private int cherryPickupHelper(int r, int rb1, int rb2, int[][] grid, int[][][] memo) {

        if (rb1 < 0 || rb1 > grid[0].length - 1 || rb2 < 0 || rb2 > grid[0].length - 1) {
            return -1;
        }
        if (r == grid.length - 1) {
            if (rb1 == rb2) return grid[r][rb1];
            else return grid[r][rb1] + grid[r][rb2];
        }
        if (memo[r][rb1][rb2] != -1) {
            return memo[r][rb1][rb2];
        }
        int max = Integer.MIN_VALUE;
        for (int crb1 = -1; crb1 <= 1; crb1++) {
            for (int crb2 = -1; crb2 <= 1; crb2++) {
                int val;
                if (rb1 == rb2) val = grid[r][rb1];
                else val = grid[r][rb1] + grid[r][rb2];
                val += cherryPickupHelper(r + 1, rb1 + crb1, rb2 + crb2, grid, memo);
                max = Math.max(max, val);
            }
        }
        return memo[r][rb1][rb2] = max;
    }

    public int cherryPickup(int[][] grid) {

        int len = grid[0].length;
        int[][][] arr = new int[grid.length+1][len][len];
        for (int[][] _2d : arr) {
            for (int[] a : _2d) {
                Arrays.fill(a, -1);
            }
        }
        return cherryPickupHelper(0, 0, len - 1, grid, arr);
    }

}
