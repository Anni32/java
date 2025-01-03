class Solution {
    public int strStr(String haystack, String needle) {
        char[] need = needle.toCharArray();
        char[] hays = haystack.toCharArray();
        int hayslength = haystack.length();
        int needlength = needle.length();

        for (int i = 0; i <= hayslength - needlength; i++) {
            int p;
            for (p = 0; p < needlength; p++) {
                if (hays[i + p] != need[p]) {
                    break;
                }
            }
            if (p == needlength) {
                return i;
            }
        }
        return -1;
    }
}
