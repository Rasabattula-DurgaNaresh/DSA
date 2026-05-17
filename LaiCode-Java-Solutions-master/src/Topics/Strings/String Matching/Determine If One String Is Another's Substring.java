public class Solution {
  public int strstr(String large, String small) {
    // Write your solution here
    for (int i = 0; i <= large.length() - small.length(); i++) {
      if (large.substring(i, i + small.length()).equals(small)) {
        return i;
      }
    }
    
    return -1;
  }
}

