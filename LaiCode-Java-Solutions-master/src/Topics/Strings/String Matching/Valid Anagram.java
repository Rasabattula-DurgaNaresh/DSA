public class Solution {
  public boolean isAnagram(String source, String target) {
    // Write your solution here
    int sourceLength = source.length();
    int targetLength = target.length();
    
    if (sourceLength != targetLength) {
      return false;
    }
    
    int[] counter = new int[26];
    for (int i=0; i<sourceLength; i++) {
      counter[source.charAt(i) - 'a']++;
      counter[target.charAt(i) - 'a']--;
    }
    
    for (int i=0; i<26; i++) {
      if (counter[i] != 0) {
        return false;
      }
    }
    
    return true;
  }
}

