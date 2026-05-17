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
  public TreeNode construct(int[] level) {
    // Write your solution here
    int n = level.length;
    if (n == 0) {
      return null;
    }
    
    TreeNode root = constructTree(level, 0);
    
    return root;
  }
  
  private TreeNode constructTree(int[] level, int idx) {
    if (idx >= level.length) {
      return null;
    }
    
    TreeNode root = new TreeNode(level[idx]);
    root.left = constructTree(level, ((2 * idx) + 1));
    root.right = constructTree(level, ((2 * idx) + 2));
    
    return root;
  }
}

