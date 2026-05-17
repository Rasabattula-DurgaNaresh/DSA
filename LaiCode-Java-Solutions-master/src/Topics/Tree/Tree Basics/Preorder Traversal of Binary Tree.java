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
  public List<Integer> preOrder(TreeNode root) {
    // Write your solution here
    list = new ArrayList<>();
    preOrderHelperIter(root);
    
    return list;
  }
  
  private void preOrderHelperIter(TreeNode root) {
    if (root == null) {
      return;
    }
    
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    
    while (!stack.isEmpty()) {
      TreeNode popped = stack.pop();
      list.add(popped.key);
      
      if (popped.right != null) {
        stack.push(popped.right);
      }
      
      if (popped.left != null) {
        stack.push(popped.left);
      }
    }
  }
  
  private void preOrderHelperRec(TreeNode root) {
    if (root == null) {
      return;
    } 
    
    list.add(root.key);
    preOrderHelperRec(root.left);
    preOrderHelperRec(root.right);
  }
}

