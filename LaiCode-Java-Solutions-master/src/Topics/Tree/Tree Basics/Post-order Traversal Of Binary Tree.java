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
  public List<Integer> postOrder(TreeNode root) {
    // Write your solution here
    list = new ArrayList<>();
    helperIter(root);
    return list;
  }
  
  private void helperIter(TreeNode root) {
    if (root == null) {
      return;
    }
    
    Stack<TreeNode> stack1 = new Stack<>();
    Stack<TreeNode> stack2 = new Stack<>();
    
    stack1.add(root);
    
    while (!stack1.isEmpty()) {
      TreeNode popped = stack1.pop();
      
      if (popped.left != null) {
        stack1.push(popped.left);
      }
      
      if (popped.right != null) {
        stack1.push(popped.right);
      }
      
      stack2.push(popped);
    }
    
    while (!stack2.isEmpty()) {
      list.add(stack2.pop().key);
    }
  }
  
  private void helperRec(TreeNode root) {
    if (root == null) {
      return;
    }
    
    helperRec(root.left);
    helperRec(root.right);
    list.add(root.key);
  }
}

