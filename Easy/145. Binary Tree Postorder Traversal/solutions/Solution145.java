import java.util.ArrayList;
import java.util.List;

public class Solution145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        recursiveAppender(root, list);
        return list;
    }

    private void recursiveAppender(TreeNode node, List<Integer> list) {
        if (node == null) return;
        recursiveAppender(node.left, list);
        recursiveAppender(node.right, list);
        list.add(node.val);
    }
}