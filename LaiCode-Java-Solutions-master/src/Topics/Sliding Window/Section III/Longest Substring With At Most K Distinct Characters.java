public class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int slow = 0;
        int fast = 0;
        int n = s.length();
        int maxLength = 0;
      
        while (fast < n) {
            map.put(s.charAt(fast), map.getOrDefault(s.charAt(fast), 0) + 1);

            if (map.size() > k) {
                while (map.size() > k) {
                    map.put(s.charAt(slow), map.get(s.charAt(slow)) - 1);
                    if (map.get(s.charAt(slow)) == 0) {
                        map.remove(s.charAt(slow));
                    }

                    slow++;
                }
            }

            if ((fast - slow + 1) > maxLength) {
                maxLength = fast - slow + 1;
            }

            fast++;
        }

        return maxLength;
  }
}

