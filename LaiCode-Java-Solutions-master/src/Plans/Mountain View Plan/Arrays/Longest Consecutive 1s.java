public class Solution {
  public int longest(int[] array) {
    // Write your solution here
    int max = 0;
    int idx = 0;
    int len = array.length;
    
    while (idx < len) {
      if (array[idx] == 1) {
        int count = 0;
        while (idx < len && array[idx] == 1) {
          count++;
          idx++;
        }
        
        max = Math.max(max, count);
      }
      else {
        idx++;
      }
    }
    
    return max;
  }
}

