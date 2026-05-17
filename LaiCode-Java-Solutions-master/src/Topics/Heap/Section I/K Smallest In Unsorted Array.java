public class Solution {
  public int[] kSmallest(int[] array, int k) {
    // Write your solution here
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    for (int num : array) {
      pq.add(num);
    }
    
    int[] ans = new int[k];
    for (int i=0; i<k; i++) {
      ans[i] = pq.poll();
    }
    
    return ans;
  }
}

