class Solution {
    public int uniquePaths(int m, int n) {
        // Total steps to take
        int N = m + n - 2;
        // Number of downward or rightward steps (choose the smaller one to optimize)
        int K = Math.min(m - 1, n - 1); 
        
        long ans = 1;
        
        // Calculate N Choose K iteratively
        for (int i = 1; i <= K; i++) {
            ans = ans * (N - K + i) / i;
        }
        
        return (int) ans;
    }
}
