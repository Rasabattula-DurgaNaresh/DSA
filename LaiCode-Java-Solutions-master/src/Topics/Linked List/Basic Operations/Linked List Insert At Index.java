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
  public ListNode insert(ListNode head, int index, int value) {
    // Write your solution here
    ListNode node = new ListNode(value);
    if (index == 0) {
      node.next = head;
      return node;
    }
    
    int idx = 0;
    ListNode curr = head;
    while (curr != null) {
      idx++;
      if (idx == index) {
        node.next = curr.next;
        curr.next = node;
        break;
      }
      
      curr = curr.next;
    }
    
    return head;
  }
}

