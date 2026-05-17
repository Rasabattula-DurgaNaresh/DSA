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
  List<Integer> ans;
  public List<Integer> levelOrderBottom(TreeNode root) {
    // Write your solution here
    ans = new ArrayList<>();
    helper(root);
    return ans;
  }
  
  private void helper(TreeNode root) {
    if (root == null) {
      return;
    }
    
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      ans.clear();
      int size = queue.size();
      while (size-- > 0) {
        TreeNode node = queue.remove();
        ans.add(node.key);
        
        if (node.left != null) {
          queue.add(node.left);
        }
        
        if (node.right != null) {
          queue.add(node.right);
        }
      }
    }
  }
}

