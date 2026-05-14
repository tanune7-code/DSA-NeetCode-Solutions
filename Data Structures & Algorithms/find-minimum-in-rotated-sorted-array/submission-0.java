public class Solution {
    public int findMin(int[] nums) {
        // Handle edge case where the array has only one element
        if (nums == null || nums.length == 0) {
            return -1; 
        }
        
        int left = 0;
        int right = nums.length - 1;
        
        // Binary search loop
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            // If mid element is greater than the rightmost element,
            // the minimum must be to the right of mid.
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } 
            // If mid element is less than or equal to the rightmost element,
            // mid itself could be the minimum, or the minimum is to its left.
            else {
                right = mid;
            }
        }
        
        // When left == right, they both point to the minimum element
        return nums[left];
    }
}
