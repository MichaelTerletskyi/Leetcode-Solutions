public class Solution169 {
    public int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int majorityElement = nums[0];
        int vote = 0;
        for (int num : nums) {
            vote += num == majorityElement ? 1 : -1;
            if (vote == 0) {
                majorityElement = num;
                vote = 1;
            }
        }
        return majorityElement;
    }
}