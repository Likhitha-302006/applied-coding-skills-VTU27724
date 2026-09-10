class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    private boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        }
   
        if (left == null || right == null) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }
               return isMirror(left.left, right.right) &&
               isMirror(left.right, right.left);
    }
}



Input
root =
[1,2,2,3,4,4,3]
Output
true
Expected
true
