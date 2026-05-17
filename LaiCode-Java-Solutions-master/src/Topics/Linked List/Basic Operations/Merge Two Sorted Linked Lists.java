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
  public ListNode merge(ListNode one, ListNode two) {
    // Write your solution here
    ListNode head = new ListNode(-1);
    ListNode curr = head;
    
    while (one != null || two != null) {
      int val;
      if (one != null && two != null) {
        if (one.value < two.value) {
          val = one.value;
          one = one.next;
        }
        else {
          val = two.value;
          two = two.next;
        }
      }
      else if (one == null && two != null) {
        val = two.value;
        two = two.next;
      }
      else {
        val = one.value;
        one = one.next;
      }
      
      curr.next = new ListNode(val);
      curr = curr.next;
    }
    
    return head.next;
  }
}

