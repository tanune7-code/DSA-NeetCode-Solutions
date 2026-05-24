/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);
    }

    private boolean validate(TreeNode node, Integer min, Integer max) {
        if (node == null) return true;

        // Current node value must be strictly within the min and max bounds
        if ((min != null && node.val <= min) || (max != null && node.val >= max)) {
            return false;
        }

        // Left child must be smaller than current node val (update max bound)
        // Right child must be larger than current node val (update min bound)
        return validate(node.left, min, node.val) && validate(node.right, node.val, max);
    }
}

