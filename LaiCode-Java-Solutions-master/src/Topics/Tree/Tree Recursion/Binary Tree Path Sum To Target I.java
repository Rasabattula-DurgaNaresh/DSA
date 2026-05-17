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
  public boolean exist(TreeNode root, int target) {
    // Write your solution here
    if (root == null) {
      return false;
    }
    
    return existHelper(root, target);
  }
  
  private boolean existHelper(TreeNode root, int target) {
    if (root.left == null && root.right == null) {
      return target - root.key == 0;
    }
    
    return (root.left != null ? existHelper(root.left, target - root.key) : false) || 
            (root.right != null ? existHelper(root.right, target - root.key) : false);
  }
}

