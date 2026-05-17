public class Solution {
  public boolean isMinHeap(int[] array) {
    // Write your solution here
    int prev = array[0];
    for (int i=1; i<array.length; i++) {
      if (prev > array[i]) {
        return false;
      }
      
      prev = array[i];
    }
    
    return true;
  }
}

