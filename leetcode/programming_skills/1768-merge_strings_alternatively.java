// Note: could have used Math.max and compared string lengths but wanted to walk through the logic for experience.
class Solution {
    public String mergeAlternately(String word1, String word2) {
    int theLength = 0;
    String endResult = "";
// the following section compares both words, finds the longest one, and stores the length in theLength
    if (word1.length() >= word2.length()){
        theLength += word1.length();
    } else {
        theLength += word2.length();
    }
// the following section loops through both word 1 and word 2 characters one at a time until they are pieced together
    for (int i = 0; i < theLength; i++){
        if (i < word1.length()){
            endResult += word1.charAt(i);
        }
        if (i < word2.length()){
            endResult += word2.charAt(i);
        }
    }return endResult;
}
}
