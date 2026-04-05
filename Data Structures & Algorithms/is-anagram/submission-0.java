public class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths differ, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26]; // constant space for 'a' to 'z'

        // Count characters in s
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Subtract counts using t
        for (char c : t.toCharArray()) {
            freq[c - 'a']--;
            if (freq[c - 'a'] < 0) {
                return false; // early exit if mismatch
            }
        }

        return true; // all counts balanced
    }
}
