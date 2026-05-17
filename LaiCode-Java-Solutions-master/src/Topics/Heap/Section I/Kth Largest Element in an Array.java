public class Solution {
  public int findKthLargest(int[] nums, int k) {
    // Write your solution here
      PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
          return o2.compareTo(o1);
        }
      }); 
    
    for (int num : nums) {
      pq.add(num);
    }
    
    while (k > 1) {
      pq.poll();
      k--;
    }
    
    return pq.poll();
  }
}

