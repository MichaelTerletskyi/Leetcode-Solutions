public class Solution168 {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while (columnNumber > 0) {
            if (columnNumber % 26 != 0) {
                sb.append((char) (columnNumber % 26 + 64));
                columnNumber /= 26;
            } else {
                sb.append('Z');
                columnNumber = columnNumber / 26 - 1;
            }
        }
        return sb.reverse().toString();
    }
}