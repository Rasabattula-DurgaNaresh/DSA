public class Solution {
  public boolean validPalindrome(String input) {
    // Write your solution here
    int start = 0;
    int end = input.length() - 1;
    
    while (start < end) {
      if (input.charAt(start) != input.charAt(end)) {
        return isPalindromeHelper(input, start, end - 1) || isPalindromeHelper(input, start + 1, end);
      }
      
      start++;
      end--;
    }
    
    return true;
  }
  
  private boolean isPalindromeHelper(String inp, int start, int end) {
    while (start < end) {
      if (inp.charAt(start) != inp.charAt(end)) {
        return false;
      }
      
      start++;
      end--;
    }
    
    return true;
  }
}

