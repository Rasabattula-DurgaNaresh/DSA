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
  public ListNode removeElements(ListNode head, int val) {
    // Write your solution here
    if (head == null) {
      return head;
    }
    
    while (head != null && head.value == val) {
      head = head.next;
    }
    
    ListNode curr = head;
    while (curr != null) {
      if (curr.next != null && curr.next.value == val) {
        curr.next = curr.next.next;
      }
      else {
        curr = curr.next;
      }
    }
    
    return head;
  }
}

