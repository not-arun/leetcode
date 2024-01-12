package medium._1026;

public class Solution {

    public int maxAncestorDiff(TreeNode root) {
        return maxAncestorDiffHelper(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    public int maxAncestorDiffHelper(TreeNode root, int min, int max) {

        if (root == null) {
            return Integer.MIN_VALUE;
        }
        max = Math.max(max, root.val);
        min = Math.min(min, root.val);
        int left = maxAncestorDiffHelper(root.left, min, max);
        int right = maxAncestorDiffHelper(root.right, min, max);
        int maxLR = Math.max(left, right);
        return Math.max(max - min, maxLR);
    }
}
