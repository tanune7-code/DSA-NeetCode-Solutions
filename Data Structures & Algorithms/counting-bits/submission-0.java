class Solution {
    public int[] countBits(int n) {
        // Allocate space for numbers from 0 to n
        int[] ans = new int[n + 1];
        
        // DP transition: ans[i] = ans[i >> 1] + (i & 1)
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        
        return ans;
    }
}

