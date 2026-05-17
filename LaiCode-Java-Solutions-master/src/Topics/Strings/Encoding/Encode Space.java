public class Solution {
  public String encode(String input) {
    // Write your solution here
    int start = 0;
    int end = input.length();
    char[] ch = input.toCharArray();
    StringBuilder sb = new StringBuilder();
    
    while (start < end) {
      if (ch[start] == ' ') {
        sb.append("20%");
      }
      else {
        sb.append(ch[start]);
      }
      
      start++;
    }
    
    return sb.toString();
  }
}

