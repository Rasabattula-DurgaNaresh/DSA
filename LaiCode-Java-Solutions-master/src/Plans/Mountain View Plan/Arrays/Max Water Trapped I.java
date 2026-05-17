public class Solution {
  public int maxTrapped(int[] array) {
    // Write your solution here
    int ans = 0;
    int start = 0;
    int end = array.length - 1;
    int leftMax = 0;
    int rightMax = 0;

    while (start < end) {
      if (array[start] < array[end]) {
        if (array[start] >= leftMax) {
          leftMax = array[start];
        }
        else {
          ans += leftMax - array[start];
        }
        start++;
      }
      else {
        if (array[end] >= rightMax) {
          rightMax = array[end];
         }
         else {
           ans += rightMax - array[end];
         }
        end--;
      }
    }

    return ans;
  }
}

