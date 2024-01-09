package easy._872;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private List<Integer> leaves = new ArrayList<>();

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {

        getLeafNodesInOrder(root1);
        List<Integer> leaves1 = leaves;
        leaves = new ArrayList<>();
        getLeafNodesInOrder(root2);
        return leaves1.equals(leaves);
    }

    private void getLeafNodesInOrder(TreeNode head) {

        if (head.left == null && head.right == null) {
            leaves.add(head.val);
        }
        if (head.left != null) {
            getLeafNodesInOrder(head.left);
        }
        if (head.right != null) {
            getLeafNodesInOrder(head.right);
        }
    }


}
