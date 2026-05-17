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
  List<String> list;
  public String[] binaryTreePaths(TreeNode root) {
    // Write your solution here
    list = new ArrayList<>();
    StringBuilder sb = new StringBuilder();
    binaryTreePathsHelper(root, sb);
    
    String[] arr = new String[list.size()];
    for (int i=0; i<list.size(); i++) {
      arr[i] = list.get(i);
    }
    
    return arr;
  }
  
  private void binaryTreePathsHelper(TreeNode root, StringBuilder sb) {
    if (root == null) {
      return;
    }
    
    sb.append(root.key);
    
    if (root.left == null && root.right == null) {
      list.add(new StringBuilder(sb.toString()).toString());
      return;
    }
    
    sb.append("->");
    
    binaryTreePathsHelper(root.left, new StringBuilder(sb.toString()));
    binaryTreePathsHelper(root.right, new StringBuilder(sb.toString()));
  }
}

