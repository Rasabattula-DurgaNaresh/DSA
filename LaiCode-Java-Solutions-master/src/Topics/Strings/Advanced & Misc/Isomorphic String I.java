public class Solution {
  public boolean isomorphic(String source, String target) {
    // Write your solution here
    int[] map = new int[512];
    for (int i = 0; i < source.length(); i++) {
      if (map[source.charAt(i)] != map[target.charAt(i)+256]) {
        return false;
      }
      
      map[source.charAt(i)] = map[target.charAt(i)+256] = i+1;
    }
    
    return true;
  }
}

