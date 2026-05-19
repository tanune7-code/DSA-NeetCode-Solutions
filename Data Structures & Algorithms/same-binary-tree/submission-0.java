
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // 1. Both are null: they are identical
        if (p == null && q == null) {
            return true;
        }
        
        // 2. One is null and the other isn't: structural mismatch
        if (p == null || q == null) {
            return false;
        }
        
        // 3. Values don't match: value mismatch
        if (p.val != q.val) {
            return false;
        }
        
        // 4. Recursively check both left and right subtrees
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

    
