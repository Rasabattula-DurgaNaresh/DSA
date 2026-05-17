public class Solution {
  public int pairs(int[] array, int target) {
    // Write your solution here
    Set<Integer> set = new HashSet<>();
    int count = 0;
    
    for (int i=0; i<array.length; i++) {
      if (set.contains(target + array[i])) {
        count++;
      }
      if (set.contains(array[i] - target)) {
        count++;
      }
      
      set.add(array[i]);
    }
    
    return count;
  }
}

