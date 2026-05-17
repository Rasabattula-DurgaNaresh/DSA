public class Solution {
  public String decompress(String input) {
    // Write your solution here
    StringBuilder sb = new StringBuilder();
    int idx = 0;
    int n = input.length();
    
    while (idx < n) {
      if (Character.isDigit(input.charAt(idx))) {
        int count = Character.getNumericValue(input.charAt(idx)) - 1;
        sb.append(String.join("", Collections.nCopies(count, String.valueOf(sb.charAt(sb.length() - 1)))));
      }
      else {
        sb.append(input.charAt(idx));
      }
      
      idx++;
    }
    
    return sb.toString();
  }
}

