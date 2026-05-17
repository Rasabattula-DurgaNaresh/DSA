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
  List<List<Integer>> nodes;
  public List<List<Integer>> layerByLayer(TreeNode root) {
    // Write your solution here
    nodes = new ArrayList<>();
    levelOrderHelper(root); 
    return nodes;
  }
  
  private void levelOrderHelper(TreeNode root) {
    if (root == null) {
      return;
    }
    
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);
    
    while (!queue.isEmpty()) {
      int size = queue.size();
      List<Integer> level = new ArrayList<>();
      while (size-- > 0) {
        TreeNode node = queue.remove();
        level.add(node.key);
        
        if (node.left != null) {
          queue.add(node.left);
        }
        
        if (node.right != null) {
          queue.add(node.right);
        }
      }
      
      nodes.add(level);
    }
  }
}

