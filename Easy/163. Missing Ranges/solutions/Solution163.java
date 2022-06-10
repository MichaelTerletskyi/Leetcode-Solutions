import java.util.LinkedList;
import java.util.List;

public class Solution163 {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        List<String> res = new LinkedList<>();
        int next = lower;
        for (int num : nums) {
            if (lower == Integer.MAX_VALUE) return res;
            if (num < next) {
                continue;
            }
            if (num == next) {
                next++;
                continue;
            }
            res.add(getRange(next, num - 1));
            if (num == Integer.MAX_VALUE) {
                return res;
            }
            next = num + 1;
        }

        if (next <= upper) {
            res.add(getRange(next, upper));
        }
        return res;
    }

    private String getRange(int n1, int n2) {
        return n1 == n2 ? String.valueOf(n1) : String.format("%d->%d", n1, n2);
    }
}
