class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        // Step 1: Calculate prefix products
        // output[i] will store the product of all elements to the left of i
        output[0] = 1;
        for(int i = 1; i<n; i++){
            output[i]= output[i-1] * nums[i-1]; //
        }
        // Step 2: Calculate suffix products on the fly
        // Multiply the prefix product by the product of all elements to the right
        int rightProduct = 1;
        for(int i = n-1; i>=0; i--){
            output[i] = rightProduct * output[i];
            rightProduct *= nums[i];
        }
        return output;
    }
}  
