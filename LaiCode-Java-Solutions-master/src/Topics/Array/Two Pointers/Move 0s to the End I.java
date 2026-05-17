public class Solution {
  public int[] moveZero(int[] array) {
    // Write your solution here
    int start = 0;
    int end = 0;
    int n = array.length;
    
    while (end < n) {
      if (array[end] != 0) {
        array[start] = array[end];
        start++;
      }
      
      end++;
    }
    
    while (start < n) {
      array[start++] = 0;
    }
    
    return array;
  }
}

