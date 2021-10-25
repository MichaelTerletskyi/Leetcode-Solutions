public class Solution14 {
    public String longestCommonPrefix(String[] array) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array[0].length(); i++) {
            char temp = array[0].charAt(i);
            for (int j = 1; j < array.length; j++) {
                if (array[j].length() > i && array[j].charAt(i) == temp) {
                    ++count;
                } else {
                    break;
                }
            }
            if (count == array.length - 1) {
                sb.append(temp);
                count = 0;
            } else {
                break;
            }
        }
        return sb.toString();
    }
}