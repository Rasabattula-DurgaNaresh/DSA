public class Solution {
  public int[] rainbowSort(int[] array) {
    // Write your solution here
    if (array.length <= 1) {
      return array;
    }
    
    int id1 = -1;
    int id2 = -1;
    int id3 = -1;
    int n = array.length;
    
    for (int i=0; i<n; i++) {
      if (array[i] == -1) {
        array[++id3] = 1;
        array[++id2] = 0;
        array[++id1] = -1;
      }
      else if (array[i] == 0) {
        array[++id3] = 1;
        array[++id2] = 0;
      }
      else {
        array[++id3] = 1;
      }
    }
    
    return array;
  }
}

