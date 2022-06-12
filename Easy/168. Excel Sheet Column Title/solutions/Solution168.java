public class Solution168 {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            if (columnNumber % 26 != 0) {
                char ch = (char) (columnNumber % 26 + 64);
                sb.append(ch);
                columnNumber /= 26;
            } else {
                sb.append('Z');
                columnNumber = columnNumber / 26 - 1;
            }
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new Solution168().convertToTitle(52));
    }
}