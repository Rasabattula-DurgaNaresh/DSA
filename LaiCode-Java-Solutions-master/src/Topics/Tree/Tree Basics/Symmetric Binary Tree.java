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
  public boolean isSymmetric(TreeNode root) {
    // Write your solution here
    if (root == null) {
      return true;
    }
    
    return isSymmetricHelper(root.left, root.right);
  }
  
  private boolean isSymmetricHelper(TreeNode left, TreeNode right) {
    if (left == null && right == null) {
      return true;
    }
    
    if ((left == null && right != null) || (left != null && right == null)) {
      return false;
    }
    
    if (left.key != right.key) {
      return false;
    }
    
    return isSymmetricHelper(left.left, right.right) && isSymmetricHelper(left.right, right.left);
  }
}

