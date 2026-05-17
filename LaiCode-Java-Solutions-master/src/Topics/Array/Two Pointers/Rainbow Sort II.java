public class Solution {
  public int[] rainbowSortII(int[] array) {
    // Write your solution here
    int[] idx = new int[4];
    int count = 3;
    Arrays.fill(idx, -1);
    int n = array.length;
    
    for (int i=0; i<n; i++) {
      if (array[i] == 0) {
        for (int j=0; j<4; j++) {
          array[++idx[j]] = count - j;
        }
      }
      else if (array[i] == 1) {
        for (int j=0; j<3; j++) {
          array[++idx[j]] = count - j;
        }
      }
      else if (array[i] == 2) {
        for (int j=0; j<2; j++) {
          array[++idx[j]] = count - j;
        }
      }
      else {
        for (int j=0; j<1; j++) {
          array[++idx[j]] = count - j;
        }
      }
    }
    
    return array;
  }
}

