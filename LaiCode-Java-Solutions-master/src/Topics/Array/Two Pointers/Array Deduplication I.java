public class Solution {
  public int[] dedup(int[] array) {
    // Write your solution here
    int start = 0;
    int end = 0;
    int n = array.length;
    Set<Integer> set = new HashSet<>();
    
    while (end < n) {
      if (!set.contains(array[end])) {
        array[start] = array[end];
        set.add(array[end]);
        start++;
      }
      
      end++;
    }
    
    int[] ans = new int[start];
    
    for (int i=0; i<start; i++) {
      ans[i] = array[i];
    }
    
    return ans;
  }
}

