public class Solution112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        return has(root, 0, sum);
    }

    private boolean has(TreeNode root, int current, int target) {
        if (root.left == null && root.right == null) {
            return target == current + root.val;
        }

        current += root.val;
        boolean res = false;

        if (root.left != null) {
            res = has(root.left, current, target);
        }
        if (res) {
            return true;
        }
        if (root.right != null) {
            res = has(root.right, current, target);
        }
        return res;
    }
}