public class Solution171 {
    public int titleToNumber(String columnTitle) {
        char[] chars = columnTitle.toCharArray();
        int n = chars.length - 1;
        int square;
        int total = 0;

        for (char ch : chars) {
            square = (int) Math.pow(26, n);
            n--;
            total += ((int) ch - 64) * square;
        }
        return total;
    }
}