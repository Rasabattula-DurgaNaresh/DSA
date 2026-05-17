public class Solution {
  public int[] plus(int[] digits) {
    // Write your solution here
    int carry = 1;
    int i = digits.length - 1;
    
    while (i >= 0) {
      digits[i] = digits[i] + carry;
      if (digits[i] <= 9) {
        return digits;
      }
      
      digits[i] = 0;
      i--;
    }
    
    int[] ans = new int[digits.length + 1];
    ans[0] = 1;
    
    return ans;
  }
}

