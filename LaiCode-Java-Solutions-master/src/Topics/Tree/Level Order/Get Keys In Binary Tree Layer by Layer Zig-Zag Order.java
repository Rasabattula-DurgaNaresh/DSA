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
  public List<Integer> zigZag(TreeNode root) {
    // Write your solution here
    if (root == null) {
      return new ArrayList<>();
    }
    int count = 0;
    List<Integer> ans = new ArrayList<>();
    Queue<TreeNode> queue = new LinkedList<>();
    queue.add(root);

    while (!queue.isEmpty()) {
      int size = queue.size();
      boolean leftToRight = count % 2 == 1;
      List<Integer> temp = new ArrayList<>();
      while (size-- > 0) {
        TreeNode removed = queue.remove();
        temp.add(removed.key);
        if (removed.left != null) {
          queue.add(removed.left);
        }

        if (removed.right != null) {
          queue.add(removed.right);
        }
      }

      if (leftToRight) {
        for (Integer num : temp) {
          ans.add(num);
        }
      }
      else {
        for (int i = temp.size() - 1; i >= 0; i--) {
          ans.add(temp.get(i));
        }
      }

      count++;
    }

    return ans;
  }
}

