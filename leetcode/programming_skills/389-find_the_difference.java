class Solution {
    public char findTheDifference(String s, String t) {
//converts s and t to two separate arrays containing individual characters of s and t.
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
//sorts arrays for easier comparison
        Arrays.sort(first);
        Arrays.sort(second);
//iterates through all characters as long as length is < first.length
        for (int i = 0; i < first.length; i++) {
            if (first[i] != second[i]) {
                return second[i];
            }
        }
        return second[second.length - 1]; //alternatively could use first.length because first is 1 less character than second
    }
}
