class Solution:
    def wordBreak(self, s: str, wordDict: List[str]) -> bool:
        # Convert list to set for O(1) lookups
        word_set = set(wordDict)
        
        # dp[i] will store True if s[0:i] can be segmented
        dp = [False] * (len(s) + 1)
        
        # Base case: an empty string is always valid
        dp[0] = True
        
        # Iterate through every character position in the string
        for i in range(1, len(s) + 1):
            # Check all possible split points before the current position
            for j in range(i):
                # If the prefix s[0:j] is valid AND the remaining substring s[j:i] is in the dictionary
                if dp[j] and s[j:i] in word_set:
                    dp[i] = True
                    break # Found a valid match for position i, move to next i
                    
        return dp[len(s)]

        