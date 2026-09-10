import java.util.*;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root, result);
        return result;
    }

    private void inorder(TreeNode root, List<Integer> result) {
        if (root == null) {
            return;
        }

        // Left
        inorder(root.left, result);

        // Root
        result.add(root.val);

        // Right
        inorder(root.right, result);
    }
}

Input
root =
[1,null,2,3]
Output
[1,3,2]
Expected
[1,3,2]
