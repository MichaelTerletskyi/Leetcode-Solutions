public class Solution101 {
    public boolean isSymmetric(TreeNode root) {
        return isSame(root, root);
    }

    public boolean isSame(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) return true;
        if (node1 == null || node2 == null) return false;

        return (node1.val == node2.val)
                && isSame(node1.right, node2.left)
                && isSame(node1.left, node2.right);
    }
}