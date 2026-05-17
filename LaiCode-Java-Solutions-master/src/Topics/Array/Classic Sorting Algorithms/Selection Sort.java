public class Solution {
  public int[] solve(int[] array) {
    // Write your solution here
    int n = array.length;
    int idx = 0;
    for (int i=0; i<n; i++) {
      int minIdx = i;
      for (int j=i; j<n; j++) {
        if (array[minIdx] > array[j]) {
          minIdx = j;
        }
      }
      
      int temp = array[i];
      array[i] = array[minIdx];
      array[minIdx] = temp;
    }
    
    return array;
  }
}

