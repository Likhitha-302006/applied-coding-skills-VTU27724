import java.util.*;

class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();

        dfs(root, "", result);

        return result;
    }

    private void dfs(TreeNode root, String path, List<String> result) {

        if (root == null) {
            return;
        }
        if (path.isEmpty()) {
            path = String.valueOf(root.val);
        } else {
            path = path + "->" + root.val;
        }


        if (root.left == null && root.right == null) {
            result.add(path);
            return;
        }


        dfs(root.left, path, result);
        dfs(root.right, path, result);
    }
}


Input
root =
[1,2,3,null,5]
Output
["1->2->5","1->3"]
Expected
["1->2->5","1->3"]