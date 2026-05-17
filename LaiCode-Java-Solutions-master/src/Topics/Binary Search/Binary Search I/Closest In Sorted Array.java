public class Solution {
  public int closest(int[] array, int target) {
    // Write your solution here
    if (array == null || array.length == 0) {
      return -1;
    }

    if (target <= array[0]) {
      return 0;
    }

    if (target >= array[array.length - 1]) {
      return array.length - 1;
    }

    int mid = 0;
    int left = 0;
    int right = array.length - 1;
    while (left <= right) {
      mid = (left + right) / 2;
      if (array[mid] == target) {
        return mid;
      }
      else if (target < array[mid]) {
        if (mid > 0 && target > array[mid - 1]) {
          return getClosest(array, mid - 1, mid, target);
        }

        right = mid;
      }
      else {
        if (mid < array.length - 1 && target < array[mid + 1]) {
          return getClosest(array, mid + 1, mid, target);
        }

        left = mid + 1;
      }
    }

    return mid;
  }

  private int getClosest(int[] arr, int idx1, int idx2, int target) {
    if (Math.abs(target - arr[idx1]) < Math.abs(target - arr[idx2])) {
      return idx1;
    }
    else {
      return idx2;
    }
  }
}

