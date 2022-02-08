import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        recursiveAppender(list, root);
        return list;
    }

    public void recursiveAppender(List<Integer> list, TreeNode node) {
        if (node == null) return;
        recursiveAppender(list, node.left);
        list.add(node.val);
        recursiveAppender(list, node.right);
    }
}