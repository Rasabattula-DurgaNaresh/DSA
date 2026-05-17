public class Solution {
  public int[] dedup(int[] array) {
    // Write your solution here
    int slow = 0;
    int end = 0;
    int n = array.length;
    
    Map<Integer, Integer> map = new HashMap<>();
    
    while (end < n) {
      if (map.getOrDefault(array[end], 0) == 2) {
        end++;
      }
      else {
        array[slow] = array[end];
        map.put(array[end], map.getOrDefault(array[end], 0) + 1);
        
        slow++;
        end++;
      }
    }
    
    int[] ans = new int[slow];
    
    for (int i=0; i<slow; i++) {
      ans[i] = array[i];
    }
    
    return ans;
  }
}

