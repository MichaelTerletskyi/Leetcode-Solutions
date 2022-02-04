public class Solution70 {
    public int climbStairs(int n) {
        int x = 0;
        int y = 1;
        int temp = n;
        for (int i = 1; i <= n; i++) {
            temp = x + y;
            x = y;
            y = temp;
        }
        return temp;
    }
}