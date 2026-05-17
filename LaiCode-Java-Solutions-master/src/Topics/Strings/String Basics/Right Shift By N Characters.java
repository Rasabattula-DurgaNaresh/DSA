public class Solution {
  public String rightShift(String input, int n) {
    // Write your solution here
    if (input.length() <= 1) {
      return input;
    }
    
    int len = input.length();
    n = n % len;
    
    char[] ch = input.toCharArray();
    char[] ans = new char[len];
   
    for (int i=0; i<ch.length; i++) {
      int idx = i + n;
      if (idx >= len) {
        idx -= len;
      }
      
      ans[idx] = ch[i];
    }
    
    return String.valueOf(ans);
  }
}

