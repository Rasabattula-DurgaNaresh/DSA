public class Solution {
  public boolean valid(String input) {
    // Write your solution here
    char[] ch = input.toCharArray();
    int start = 0;
    int end = input.length() - 1;
    
    while (start <= end) {
      if (Character.isLetterOrDigit(ch[start]) && Character.isLetterOrDigit(ch[end])) {
        if (ch[start] != ch[end]) {
          return false;
        }
        
        start++;
        end--;
      }
      else {
        if (!Character.isLetterOrDigit(ch[start])) {
          start++;
        }
      
        if (!Character.isLetterOrDigit(ch[end])) {
          end--;      
        }
      }
    }
    
    return true;
  }
}

