import java.util.Arrays; //imports java.util.arrays class for easier sorting

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ssort = s.toCharArray();
        char[] tsort = t.toCharArray();

        if (s.length() != t.length()){ //makes sure length is the same as that is part of being an anagram
            return false;
        }

        Arrays.sort(ssort);
        Arrays.sort(tsort);

        for (int i = 0; i < s.length(); i++){ //logic to compare characters in arrays 
            if (ssort[i] != tsort[i]){ //returns false if items don't match after being sorted
                return false;
        }
    }return true;
    }
}

//using Arrays.equals:

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ssort = s.toCharArray();
        char[] tsort = t.toCharArray();

        if (s.length() != t.length()) {
            return false;
        }

        Arrays.sort(ssort);
        Arrays.sort(tsort);
      
        return Arrays.equals(ssort, tsort); //method replaces for loop with if statement
    }
}
