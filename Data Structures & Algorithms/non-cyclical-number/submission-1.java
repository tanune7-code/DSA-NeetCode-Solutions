class Solution {
    // Helper method to calculate the sum of squares of digits
    private int getNext(int n) {
        int totalSum = 0;
        while (n > 0) {
            int d = n % 10;
            totalSum += d * d;
            n = n / 10;
        }
        return totalSum;
    }

    public boolean isHappy(int n) {
        int slow = n;
        int fast = getNext(n);
        
        while (fast != 1 && slow != fast) {
            slow = getNext(slow);         // Moves 1 step
            fast = getNext(getNext(fast)); // Moves 2 steps
        }
        
        return fast == 1;
    }
}
