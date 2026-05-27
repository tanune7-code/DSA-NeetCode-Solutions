class Solution {
    public int missingNumber(int[] nums) {
        int xor = nums.length; // Start with n
        
        for (int i = 0; i < nums.length; i++) {
            xor ^= i ^ nums[i]; // XOR the index and the value
        }
        
        return xor;
    }
}

