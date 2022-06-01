import java.util.LinkedList;
import java.util.Queue;

public class Soluton111 {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode righest = root;
        queue.add(root);
        int depth = 1;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.left == null && node.right == null) {
                break;
            }
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
            if (node == righest) {
                ++depth;
                righest = (node.right != null) ? node.right : node.left;
            }
        }
        return depth;
    }
}