import java.util.ArrayList;
import java.util.List;

public class Solution144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        recursiveAppender(list, root);
        return list;
    }

    private void recursiveAppender(List<Integer> list, TreeNode node) {
        if (node == null) return;
        list.add(node.val);
        recursiveAppender(list, node.left);
        recursiveAppender(list, node.right);
    }
}