class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        
        for (int num : nums) {
            // If count falls to 0, choose the current number as the new candidate
            if (count == 0) {
                candidate = num;
            }
            
            // If the current number matches the candidate, increment; otherwise decrement
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;
    }
}
