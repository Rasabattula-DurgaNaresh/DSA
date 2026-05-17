public class Solution {
  public int longest(String input) {
    // Write your solution here
    Set<Character> set = new HashSet<>();
    int slow = 0;
    int end = 0;
    int n = input.length();
    int max = Integer.MIN_VALUE;
    
    while (end < n) {
      if (set.contains(input.charAt(end))) {
        while (slow < n && set.contains(input.charAt(end))) {
          set.remove(input.charAt(slow));
          slow++;
        }
      }
      
      set.add(input.charAt(end));
      end++;
      
      max = Math.max(max, end - slow);
    }
    
    return Math.max(max, (end - slow));
  }
}

