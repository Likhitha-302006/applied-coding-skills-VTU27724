import java.util.*;

class Solution {
    public int kthSmallest(TreeNode root, int k) {

        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {

                       while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            k--;

            if (k == 0) {
                return current.val;
            }

            current = current.right;
        }

        return -1;
    }
}




Input
root =
[3,1,4,null,2]
k =
1
Output
1
Expected
1
