class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = a & b; // Calculate the carry bits
            a = a ^ b;         // Add without carrying
            b = carry << 1;    // Shift carry to the left
        }
        return a;
    }
}
