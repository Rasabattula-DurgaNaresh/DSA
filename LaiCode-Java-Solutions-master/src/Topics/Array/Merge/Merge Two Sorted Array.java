public class Solution {
  public int[] merge(int[] A, int m, int[] B, int n) {
    // Write your solution here
    int[] ans = new int[m + n];
    int idx = 0;
    int i = 0;
    int j = 0;
    
    while (i < m && j < n) {
      if (A[i] < B[j]) {
        ans[idx++] = A[i++];
      }
      else {
        ans[idx++] = B[j++];
      }
    }
    
    while (i < m) {
      ans[idx++] = A[i++];
    }
    
    while (j < n) {
      ans[idx++] = B[j++];
    }
    
    return ans;
  }
}

