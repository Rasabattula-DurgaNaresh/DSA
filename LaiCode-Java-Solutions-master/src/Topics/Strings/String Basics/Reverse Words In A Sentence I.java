public class Solution {
  public String reverseWords(String input) {
    // Write your solution here
    StringBuilder sb = new StringBuilder();
    char[] ch = input.toCharArray();
    int i = ch.length - 1;
    while (i >= 0) {
      StringBuilder temp = new StringBuilder();
      while (i >= 0 && Character.isLetter(ch[i])) {
        temp.append(ch[i]);
        i--;
      }
      
      if (temp.length() > 0) {
        sb.append(temp.reverse().toString()).append(" ");
      }
      
      i--;
    }  
    
    return sb.toString().trim();
  }
}

