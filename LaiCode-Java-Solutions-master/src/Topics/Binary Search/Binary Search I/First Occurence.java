public class Solution {
  public int firstOccur(int[] array, int target) {
    // Write your solution here
    int firstOcc = Integer.MAX_VALUE;
    int start = 0;
    int end = array.length - 1;

    while (start <= end) {
      int mid = (start + end) / 2;
      if (array[mid] >= target) {
        if (array[mid] == target) {
          firstOcc = Math.min(mid, firstOcc);
        }
        end = mid - 1;
      }
      else {
        start = mid + 1;
      }
    }

    return firstOcc == Integer.MAX_VALUE ? -1 : firstOcc;
  }
}

