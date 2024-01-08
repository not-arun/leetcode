package easy._938;

public class Solution {

    public int rangeSumBST(TreeNode root, int low, int high) {

        if (root == null) {
            return 0;
        }
        int sum = isBetween(root.val, low, high) ? root.val : 0;
        if (root.left != null) {
            sum += rangeSumBST(root.left, low, high);

        }
        if (root.right != null) {
            sum += rangeSumBST(root.right, low, high);
        }
        return sum;
    }

    private boolean isBetween(int val, int low, int high) {
        return val >= low && val <= high;
    }
}
