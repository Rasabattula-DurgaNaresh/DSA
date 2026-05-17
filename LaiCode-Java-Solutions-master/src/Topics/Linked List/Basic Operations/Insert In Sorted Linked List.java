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
  public ListNode insert(ListNode head, int value) {
    // Write your solution here
    ListNode node = new ListNode(value);
    
    if (head == null) {
      return node;
    }

    if (head.value >= value) {
      node.next = head;
      return node;
    }
    
    ListNode curr = head;
    while (curr != null) {
      if (curr.next == null || curr.next.value >= value) {
        node.next = curr.next;
        curr.next = node;
        break;
      }
      
      curr = curr.next;
    }
    
    return head;
  }
}

