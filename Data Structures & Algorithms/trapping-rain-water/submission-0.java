class Solution {
    public int trap(int[] height) {
        if (height == null || height.length == 0) return 0;

        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        int totalWater = 0;

        while (left < right) {
            if (height[left] < height[right]) {
                // If current left height is greater than leftMax, update it
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    // Otherwise, calculate trapped water
                    totalWater += leftMax - height[left];
                }
                left++; // Move left pointer forward
            } else {
                // If current right height is greater than rightMax, update it
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    // Otherwise, calculate trapped water
                    totalWater += rightMax - height[right];
                }
                right--; // Move right pointer backward
            }
        }

        return totalWater;
    }
}
