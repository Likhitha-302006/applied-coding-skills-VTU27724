class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {

             if (root == null) {
            return false;
        }

             if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }

               int remainingSum = targetSum - root.val;

        return hasPathSum(root.left, remainingSum) ||
               hasPathSum(root.right, remainingSum);
    }
}



Input
root =
[5,4,8,11,null,13,4,7,2,null,null,null,1]
targetSum =
22
Output
true
Expected
true