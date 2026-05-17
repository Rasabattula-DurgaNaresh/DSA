public class Solution {
  public String compress(String input) {
    // Write your solution here
    StringBuilder sb = new StringBuilder();
    int idx = 0;
    int n = input.length();
    
    while (idx < n) {
      char c = input.charAt(idx);
      int start = idx;
      while (start < n && input.charAt(start) == c) {
        start++;
      }
      
      sb.append(c);
      if (start - idx > 1) {
        sb.append(start - idx);
      }
      
      idx = start;
    }
    
    return sb.toString();
  }
}

