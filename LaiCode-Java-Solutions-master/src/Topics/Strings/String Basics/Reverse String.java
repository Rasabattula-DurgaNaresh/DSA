public class Solution {
  public String reverse(String input) {
    // Write your solution here
    StringBuilder sb = new StringBuilder();
    int n = input.length() - 1;
    while (n >= 0) {
      sb.append(input.charAt(n));
      n--;
    }
    
    return sb.toString();
  }
}

