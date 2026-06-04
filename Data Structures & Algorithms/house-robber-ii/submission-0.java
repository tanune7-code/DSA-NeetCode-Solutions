class Solution {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        
        // Max money robbing excluding the last house vs excluding the first house
        return Math.max(robLinear(nums, 0, nums.length - 2), 
                        robLinear(nums, 1, nums.length - 1));
    }
    
    private int robLinear(int[] nums, int start, int end) {
        int prevMax = 0; // Tracks max money up to 2 houses ago
        int currMax = 0; // Tracks max money up to 1 house ago
        
        for (int i = start; i <= end; i++) {
            int temp = currMax;
            // Option 1: Rob current house + max from 2 houses ago
            // Option 2: Skip current house and keep max from 1 house ago
            currMax = Math.max(prevMax + nums[i], currMax);
            prevMax = temp;
        }
        
        return currMax;
    }
}
