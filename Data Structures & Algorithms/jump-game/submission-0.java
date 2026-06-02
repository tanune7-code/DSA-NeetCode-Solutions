class Solution {
    public boolean canJump(int[] nums) {
        int maxReachable = 0;
        
        for (int i = 0; i < nums.length; i++) {
            // If the current index is beyond the maximum reachable index, we are stuck
            if (i > maxReachable) {
                return false;
            }
            
            // Update the furthest index we can reach so far
            maxReachable = Math.max(maxReachable, i + nums[i]);
            
            // Optimization: If we can already reach or exceed the last index, return true
            if (maxReachable >= nums.length - 1) {
                return true;
            }
        }
        
        return true;
    }
}
