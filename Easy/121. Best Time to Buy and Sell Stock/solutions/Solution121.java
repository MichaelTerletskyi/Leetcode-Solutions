public class Solution121 {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;
        int min = prices[0];
        int prof = 0;

        for (int i = 1; i < prices.length; i++) {
            prof = Math.max(prof, prices[i] - min);
            min = Math.min(min, prices[i]);
        }
        return prof;
    }
}