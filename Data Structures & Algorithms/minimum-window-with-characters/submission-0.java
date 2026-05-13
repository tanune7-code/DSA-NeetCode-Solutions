public class Solution {
    public String minWindow(String s, String t) {
        // Step 1: Safety check
        if (s == null || t == null || s.length() < t.length()) {
            return "";
        }

        // Step 2: Build target frequency map using a primitive array
        int[] targetCounts = new int[128];
        for (int i = 0; i < t.length(); i++) {
            targetCounts[t.charAt(i)]++;
        }

        int left = 0;
        int right = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;
        int count = t.length(); // Total characters needed

        // Step 3: Slide the right pointer
        while (right < s.length()) {
            char rightChar = s.charAt(right);

            // If we still need this character, decrement our overall checklist count
            if (targetCounts[rightChar] > 0) {
                count--;
            }
            // Decrement the character requirement (can go negative for extra letters)
            targetCounts[rightChar]--;

            // Step 4: Shrink from the left when the window is valid
            while (count == 0) {
                int currentWindowLen = right - left + 1;
                
                // Update historical best answer
                if (currentWindowLen < minLen) {
                    minLen = currentWindowLen;
                    startIndex = left;
                }

                char leftChar = s.charAt(left);
                // Put the dropped character back into our requirements
                targetCounts[leftChar]++;
                
                // If we now actively lack this character, increment the checklist count
                if (targetCounts[leftChar] > 0) {
                    count++;
                }

                left++; // Move left pointer
            }

            right++; // Move right pointer
        }

        // Step 5: Slice and return result
        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLen);
    }
}

