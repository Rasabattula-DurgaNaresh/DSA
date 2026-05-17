public class Solution {
  public int searchInsert(int[] input, int target) {
    // Write your solution here
    if (input.length == 0 || input[0] > target) {
      return 0;
    } 

    int left = 0;
    int right = input.length - 1;
    int idx = Integer.MIN_VALUE;
    boolean equalFound = false;

    while (left <= right) {
      int mid = (left + right) / 2;
      if (input[mid] == target) {
        equalFound = true;
        idx = mid;
        right = mid - 1;
      }
      else if (input[mid] > target) {
        right = mid - 1;
      }
      else {
        if (!equalFound) {
          idx = Math.max(idx, mid);
        }
        left = mid + 1;
      }
    }

    return equalFound ? idx : idx + 1;
  }
}

