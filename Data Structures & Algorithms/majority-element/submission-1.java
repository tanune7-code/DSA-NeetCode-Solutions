class Solution {
    public int majorityElement(int[] nums) {
        // Pass 1: Find a candidate
        int candidate = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        
        // Pass 2: Verify if the candidate actually appears > n/2 times
        int actualCount = 0;
        for (int num : nums) {
            if (num == candidate) {
                actualCount++;
            }
        }
        
        if (actualCount > nums.length / 2) {
            return candidate; 
        } else {
            return -1; // Indicates no majority element exists (like in [1, 4, 4, 1])
        }
    }
}
