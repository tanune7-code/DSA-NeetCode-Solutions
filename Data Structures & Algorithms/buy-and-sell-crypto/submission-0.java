class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Track the lowest price seen so far
            } else {
                // If current price is higher than min, check the profit
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }
}

