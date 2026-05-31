
class Solution {
    public int coinChange(int[] coins, int amount) {
        // Initialize DP table with an unreachable maximum value
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        
        // Base case: 0 coins needed to make an amount of 0
        dp[0] = 0;
        
        // Compute minimum coins for all subproblems from 1 to amount
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
                }
            }
        }
        
        // If the amount is unreachable, return -1
        return dp[amount] > amount ? -1 : dp[amount];
    }
}

