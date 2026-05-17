public class Solution {
  public int majority(int[] arr) {
    // Write your solution here
    Arrays.sort(arr);
    return arr[arr.length / 2];
  }
}

