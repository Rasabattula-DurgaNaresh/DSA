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
  List<Integer> list;
  public List<Integer> inOrder(TreeNode root) {
    // Write your solution here
    list = new ArrayList<>();
    helperIterative(root);
    
    return list;
  }
  
  private void helperIterative(TreeNode root) {
    if (root == null) {
      return;
    }  
    
    Stack<TreeNode> stack = new Stack<>();
    while (root != null) {
      stack.push(root);
      root = root.left;
    }
    
    while (!stack.isEmpty()) {
      TreeNode popped = stack.pop();
      list.add(popped.key);
      
      popped = popped.right;
      while (popped != null) {
        stack.push(popped);
        popped = popped.left;
      }
    }
  }
  
  private void helperRec(TreeNode root) {
    if (root == null) {
      return;
    }
    
    helperRec(root.left);
    list.add(root.key);
    helperRec(root.right);
  }
}

