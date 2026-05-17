/**
 * public class TreeNode {
 *   public int key;
 *   public TreeNode left;
 *   public TreeNode right;
 *   public TreeNode(int key) {
 *     this.key = key;
 *   }
 * }
 */
public class Solution {
  public TreeNode invertTree(TreeNode root) {
    // Write your solution here
    invertHelper(root);
    return root;
  }
  
  private void invertHelper(TreeNode root) {
    if (root == null) {
      return;
    }
    
    TreeNode right = root.right;
    root.right = root.left;
    root.left = right;
    
    invertHelper(root.left);
    invertHelper(root.right);
  }
}

