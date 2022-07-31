public class Solution190 {
    public int reverseBits(final int n) {
        int res = 0; int mask = 1;
        for (int i = 0; i < 32; i++) {
            int digit = n & mask;
            res = (res << 1);
            if (digit != 0) {
                ++res;
            }
            mask <<= 1;
        }
        return res;
    }
}