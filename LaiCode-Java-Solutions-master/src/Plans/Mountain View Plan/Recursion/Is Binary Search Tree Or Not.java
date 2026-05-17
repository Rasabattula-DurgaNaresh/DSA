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
  public boolean isBST(TreeNode root) {
    // Write your solution here
    return isBSTHelper(root, Integer.MAX_VALUE, Integer.MIN_VALUE);
  }
  
  private boolean isBSTHelper(TreeNode root, int max, int min) {
    if (root == null) {
      return true;
    }
    
    if (root.key >= max || root.key <= min) {
      return false;
    }
    
    return isBSTHelper(root.left, root.key, min) && isBSTHelper(root.right, max, root.key); 
  }
}

