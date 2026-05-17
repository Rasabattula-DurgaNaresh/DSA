public class Solution {
  public String reverseWords(String input) {
    // Write your solution here
    StringBuilder ans = new StringBuilder();
    int n = input.length() - 1;
    char[] ch = input.toCharArray();
    
    while (n >= 0) {
      StringBuilder temp = new StringBuilder();
      while (n >= 0 && Character.isLetter(ch[n])) {
        temp.append(ch[n]);
        n--;
      }
      
      if (temp.length() > 0) {
        ans.append(temp.reverse().toString()).append(" ");
      }
      
      n--;
    }
    
    return ans.toString().trim();
  }
}

