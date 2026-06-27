
class Solution {
        public int maxProduct(int[] nums) {
                if (nums == null || nums.length == 0) {
                            return 0;
                                    }

                                            int res = nums[0];
                                                    int maxProd = nums[0];
                                                            int minProd = nums[0];

                                                                    for (int i = 1; i < nums.length; i++) {
                                                                                int curr = nums[i];

                                                                                            // If the current number is negative, swap max and min products
                                                                                                        if (curr < 0) {
                                                                                                                        int temp = maxProd;
                                                                                                                                        maxProd = minProd;
                                                                                                                                                        minProd = temp;
                                                                                                                                                                    }

                                                                                                                                                                                // Update max and min products for the current position
                                                                                                                                                                                            maxProd = Math.max(curr, maxProd * curr);
                                                                                                                                                                                                        minProd = Math.min(curr, minProd * curr);

                                                                                                                                                                                                                    // Update the global maximum product found so far
                                                                                                                                                                                                                                res = Math.max(res, maxProd);
                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                return res;
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                    
