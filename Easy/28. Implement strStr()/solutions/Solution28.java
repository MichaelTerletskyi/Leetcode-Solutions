public class Solution28 {
    public int strStr(String haystack, String needle) {
        //  Solution by String class method return haystack.indexOf(needle);
        if (needle.length() == 0 && haystack.length() == 0) return 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (i + needle.length() <= haystack.length()) {
                if (haystack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}