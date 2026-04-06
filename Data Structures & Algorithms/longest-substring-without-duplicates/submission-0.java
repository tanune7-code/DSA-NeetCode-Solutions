class Solution {
public int lengthOfLongestSubstring(String s) {
    HashSet<Character> set = new HashSet<>(); // 1
    int left = 0;                             // 2
    int maxLength = 0;                        // 3

    for (int right = 0; right < s.length(); right++) { // 4
        
        while (set.contains(s.charAt(right))) {        // 5
            set.remove(s.charAt(left));                // 6
            left++;                                    // 7
        }
        
        set.add(s.charAt(right));                      // 8
        maxLength = Math.max(maxLength, right - left + 1); // 9
    }
    
    return maxLength; // 10
}
}