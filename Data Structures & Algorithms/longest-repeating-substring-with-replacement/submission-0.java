class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int maxCount = 0; // Most frequent character in the CURRENT window
        int left = 0;
        
        for (int right = 0; right < s.length(); right++) {
            // Update the count of the character we just added
            maxCount = Math.max(maxCount, ++count[s.charAt(right) - 'A']);
            
            // If the window is invalid, we don't shrink it to a smaller size.
            // We just slide the WHOLE window one step to the right.
            if ((right - left + 1) - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
        }
        
        // At the end, the distance between right and left is the record-holding window size.
        return s.length() - left;
    }
}

