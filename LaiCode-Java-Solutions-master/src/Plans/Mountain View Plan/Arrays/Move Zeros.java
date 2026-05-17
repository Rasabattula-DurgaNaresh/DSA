public class Solution {
  public int[] moveZeroes(int[] nums) {
    // Write your solution here
    int slow = 0;
    int fast = 0;
    
    while (fast < nums.length) {
      if (nums[fast] != 0) {
        nums[slow] = nums[fast];
        slow++;
      }
      
      fast++;
    }
    
    while (slow < nums.length) {
      nums[slow++] = 0;
    }
    
    return nums;
  }
}

