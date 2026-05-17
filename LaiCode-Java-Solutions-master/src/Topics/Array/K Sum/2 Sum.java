public class Solution {
  public boolean existSum(int[] array, int target) {
    // Write your solution here
    Set<Integer> set = new HashSet<>();
    for (int num : array) {
      if (set.contains(target - num)) {
        return true;
      }
      
      set.add(num);
    }
    
    return false;
  }
}

