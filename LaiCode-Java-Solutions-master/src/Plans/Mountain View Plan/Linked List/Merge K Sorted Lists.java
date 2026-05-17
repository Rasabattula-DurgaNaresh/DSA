/**
 * class ListNode {
 *   public int value;
 *   public ListNode next;
 *   public ListNode(int value) {
 *     this.value = value;
 *     next = null;
 *   }
 * }
 */
public class Solution {
  public ListNode merge(List<ListNode> listOfLists) {
    // Write your solution here/.
    ListNode ans = new ListNode(-1);
    ListNode curr = ans;
    
    PriorityQueue<ListNode> pq = new PriorityQueue<>(new Comparator<ListNode>() {
      @Override
      public int compare(ListNode o1, ListNode o2) {
        return Integer.valueOf(o1.value).compareTo(Integer.valueOf(o2.value));
      }
    });
    
    for (ListNode list : listOfLists) {
      if (list != null) {
        pq.add(list);
      }
    }
    
    while (!pq.isEmpty()) {
      ListNode node = pq.remove();
      curr.next = new ListNode(node.value);
      curr = curr.next;
      if (node.next != null) {
        pq.add(node.next);
      }
    }
    
    return ans.next;
  }
}

