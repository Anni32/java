class Solution {
    public int strStr(String haystack, String needle) {
        char[] need = needle.toCharArray();
        char[] hays = haystack.toCharArray();
        int hayslength = haystack.length();
        int needlength = needle.length();

        for (int i = 0; i <= hayslength - needlength; i++) { //iterates through the max possible starting point including window (length of haystack - length of needle)
            int p; //initalizes p outside of loop so it can be using later in the if statement
            for (p = 0; p < needlength; p++) {
                if (hays[i + p] != need[p]) { //if hays at index i+p(starting point) doesn't equal need at p break loop.
                    break;
                }
            }
            if (p == needlength) { //if index p value is equal to the length of the "needle" word, return the initial position of i
                return i;
            }
        }
        return -1; //else return -1
    }
}
