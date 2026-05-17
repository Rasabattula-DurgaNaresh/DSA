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
  int minDepth = Integer.MAX_VALUE;
  
  public int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    
    if (root.left == null && root.right == null) {
      return 1;
    }
    
    int leftDepth = root.left == null ? Integer.MAX_VALUE : minDepth(root.left);
    int rightDepth = root.right == null ? Integer.MAX_VALUE : minDepth(root.right);
    
    return 1 + Math.min(leftDepth, rightDepth);
  }
}

