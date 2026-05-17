public class Solution {
  public int minDistance(int[] a, int[] b, int[] c) {
    // Write your solution here
    int minDiff = Integer.MAX_VALUE;
    
    for (int i=0; i<a.length; i++) {
      int idxB = getMinIdx(b, a[i]);
      int idxC = getMinIdx(c, a[i]);
      
      minDiff = Math.min(
                    minDiff, 
                    (Math.abs(a[i] - b[idxB]) + Math.abs(b[idxB] - c[idxC]) + Math.abs(c[idxC] - a[i]))
                  );
    }
    
    for (int i=0; i<b.length; i++) {
      int idxA = getMinIdx(a, b[i]);
      int idxC = getMinIdx(c, b[i]);
      
      minDiff = Math.min(
                    minDiff, 
                    (Math.abs(b[i] - a[idxA]) + Math.abs(a[idxA] - c[idxC]) + Math.abs(c[idxC] - b[i]))
                  );
    }
    
    for (int i=0; i<c.length; i++) {
      int idxB = getMinIdx(b, c[i]);
      int idxA = getMinIdx(a, c[i]);
      
      minDiff = Math.min(
                    minDiff, 
                    (Math.abs(c[i] - b[idxB]) + Math.abs(b[idxB] - a[idxA]) + Math.abs(a[idxA] - c[i]))
                  );
    }
    
    
    return minDiff;
  }
  
  private int getMinIdx(int[] arr, int num) {
    int idx = 0;
    int start = 0;
    int end = arr.length-1;
    
    while (start <= end) {
      int mid = (start + end) / 2;
      if (arr[mid] == num) {
        return mid;
      }
      else if (arr[mid] < num) {
        if (arr[mid] > arr[idx]) {
          idx = mid;
        }
        start = mid + 1;
      }
      else {
        end = mid - 1;
      }
    }
    
    return idx;
  }
}

