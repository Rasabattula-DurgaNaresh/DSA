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
  public ListNode removeDup(ListNode head) {
    // Write your solution here
    if (head == null) {
      return head;
    }
    
    Set<Integer> set = new HashSet<>();
    ListNode curr = head;
    set.add(curr.value);
    
    while (curr.next != null) {
      if (set.contains(curr.next.value)) {
        curr.next = curr.next.next;
      }
      else {
        curr = curr.next;
        set.add(curr.value);
      }
    }
    
    return head;
  }
}

