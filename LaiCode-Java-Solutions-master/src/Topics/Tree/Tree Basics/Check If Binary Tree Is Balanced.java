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
  public boolean isBalanced(TreeNode root) {
    // Write your solution here
    if (root == null) {
      return true;
    }
    
    int leftDepth = getDepth(root.left);
    int rightDepth = getDepth(root.right);
    
    if (Math.abs(leftDepth - rightDepth) > 1) {
      return false;
    } 
    
    return isBalanced(root.left) && isBalanced(root.right);
  }
  
  private int getDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    
    return 1 + Math.max(getDepth(root.left), getDepth(root.right));
  }
}

