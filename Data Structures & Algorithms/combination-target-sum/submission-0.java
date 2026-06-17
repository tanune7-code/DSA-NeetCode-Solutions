class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        // Sort to enable early pruning
        Arrays.sort(nums); 
        backtrack(result, new ArrayList<>(), nums, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> current, int[] nums, int remain, int start) {
        if (remain == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            // Pruning: if current element exceeds remaining target, stop searching
            if (nums[i] > remain) {
                break; 
            }
             current.add(nums[i]);
            // 'i' is passed to allow reusing the same element
            backtrack(result, current, nums, remain - nums[i], i); 
            // Backtrack
            current.remove(current.size() - 1);
        }
    }
}