public class Solution35 {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) return i;
            if (target < nums[i]) return i;
            if (target > nums[i] && i + 1 == nums.length) return nums.length;
        }
        return 0;
    }
}