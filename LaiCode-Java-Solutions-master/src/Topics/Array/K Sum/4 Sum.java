public class Solution {
  public boolean exist(int[] array, int target) {
    // Write your solution here
    for (int i = 0; i < array.length; i++) {
      for (int j = i + 1; j < array.length; j++) {
        int newTarget = target - array[i] - array[j];
        if (pairExists(array, j + 1, newTarget)) {
          return true;
        }
      }
    }

    return false;
  }

  private boolean pairExists(int[] arr, int start, int newTarget) {
    Set<Integer> set = new HashSet<>();
    for (int i = start; i < arr.length; i++) {
      if (set.contains(newTarget - arr[i])) {
        return true;
      }

      set.add(arr[i]);
    }

    return false;
  }
}

