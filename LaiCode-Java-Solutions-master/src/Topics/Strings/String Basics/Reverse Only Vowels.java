public class Solution {
  public String reverse(String input) {
    // Write your solution here
    int start = 0;
    int end = input.length() - 1;
    char[] ch = input.toCharArray();
    String vowels = "aeiou";
    boolean leftFound = false;
    boolean rightFound = false;
    
    while (start < end) {
      if (leftFound && rightFound) {
        char temp = ch[end];
        ch[end] = ch[start];
        ch[start] = temp;
        
        start++;
        end--;
        leftFound = rightFound = false;
      }
      
      if (start < end && vowels.indexOf(ch[start]) != -1) {
        leftFound = true;
      }
      else {
        start++;
      }
      
      if (start < end && vowels.indexOf(ch[end]) != -1) {
        rightFound = true;
      }
      else {
        end--;
      }
    }
    
    return String.valueOf(ch);
  }
}

