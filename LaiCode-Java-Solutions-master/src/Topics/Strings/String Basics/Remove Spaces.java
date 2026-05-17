public class Solution {
  public String removeSpaces(String input) {
    // Write your solution here
    StringBuilder sb = new StringBuilder();
    boolean prevWord = false;
    char[] ch = input.toCharArray();
    
    for (char c : ch) {
      if (c == ' ') {
        if (prevWord) {
          prevWord = false;
          sb.append(c);
        }
      }
      else {
        sb.append(c);
        prevWord = true;
      }
    }
    
    int size = sb.length() - 1;
    while (size >= 0 && sb.charAt(size) == ' ') {
      size--;
    }
    
    return sb.toString().substring(0, size+1);
  }
}

