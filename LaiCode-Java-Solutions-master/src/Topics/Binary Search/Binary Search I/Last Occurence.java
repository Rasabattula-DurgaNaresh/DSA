public class Solution {
  public int lastOccur(int[] array, int target) {
    // Write your solution here
    int lastOcc = Integer.MIN_VALUE;
    int start = 0;
    int end = array.length - 1;

    while (start <= end) {
      int mid = (start + end) / 2;
      if (array[mid] <= target) {
        if (array[mid] == target) {
          lastOcc = Math.max(lastOcc, mid);
        }
        start = mid + 1;
      }
      else {
        end = mid - 1;
      }
    }

    return lastOcc == Integer.MIN_VALUE ? -1 : lastOcc;
  }
}

