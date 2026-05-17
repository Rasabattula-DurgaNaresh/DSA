public class Solution {
  public int minSubArrayLen(int num, int[] nums) {
    // Write your solution here
    int start = 0;
    int end = 0;
    int n = nums.length;
    int currSum = 0;
    int minLen = Integer.MAX_VALUE;
    
    while (end < n) {
      currSum += nums[end];
      end++;
      
      while (currSum >= num && start < end) {
        if (end - start < minLen) {
          minLen = end - start;
        }
        
        currSum -= nums[start];
        start++;
      }
    }
    
    return minLen == Integer.MAX_VALUE ? 0 : minLen;
  }
}

