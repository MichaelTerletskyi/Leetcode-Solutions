public class Solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        return nums.length == 0
                ? null
                : makeBST(nums, 0, nums.length - 1);
    }

    TreeNode makeBST(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        } else {
            int intermediate = (start + end) / 2;
            TreeNode node = new TreeNode(nums[intermediate]);
            node.left = makeBST(nums, start, intermediate - 1);
            node.right = makeBST(nums, intermediate + 1, end);
            return node;
        }
    }
}