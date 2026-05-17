public class Solution {
  public String remove(String input, String t) {
    // Write your solution here
    StringBuilder sb = new StringBuilder();
    char[] inpChar = input.toCharArray();
    
    for (char c : inpChar) {
      if (t.indexOf(c) == -1) {
        sb.append(c);
      }
    }
    
    return sb.toString();
  }
}

