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
  public ListNode deleteNode(ListNode head, int index) {
    // Write your solution here
    if (head == null) {
      return head;
    }
    
    if (index == 0) {
      ListNode next = head.next;
      head.next = null;
      return next;
    }
    
    int idx = 0;
    ListNode curr = head;
    while (curr != null) {
      idx++;
      if (idx == index) {
        if (curr.next != null) {
          curr.next = curr.next.next;
        }
        
        break;
      }
      
      curr = curr.next;
    }
    
    return head;
  }
}

