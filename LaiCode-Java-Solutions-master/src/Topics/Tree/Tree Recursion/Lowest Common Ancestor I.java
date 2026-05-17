public class Solution {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode one, TreeNode two) {
    // Write your solution here.
    if (root == null) {
      return null;
    }
    if (one == null || two == null) {
      return null;
    }
    if (root.key == one.key || root.key == two.key) {
      return root;
    }
    TreeNode left = lowestCommonAncestor(root.left, one, two);
    TreeNode right = lowestCommonAncestor(root.right, one, two);
    if (left != null && right != null) {
      return root;
    }
    else if (left != null && right == null) {
      return left;
    }
    else {
      return right;
    }
  }
}
