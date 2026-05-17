public class Solution {
    public String longest(String input, int k) {
      
        if (k == 0) {
          return "";
        }
      
        int start = 0;
        int end = 0;
        int n = input.length();
        int startId = -1;
        int endId = -1;
        int maxLen = Integer.MIN_VALUE;

        Map<Character, Integer> map = new HashMap<>();

        while (end < n) {
            map.put(input.charAt(end), map.getOrDefault(input.charAt(end), 0) + 1);

            if (map.size() > k) {
                while (map.size() > k && start <= end) {
                    map.put(input.charAt(start), map.getOrDefault(input.charAt(start) , 0) - 1);
                    if (map.get(input.charAt(start)) == 0) {
                        map.remove(input.charAt(start));
                    }

                    start++;
                }
            }

            if (map.size() == k) {
                if (end - start + 1 > maxLen) {
                    startId = start;
                    endId = end + 1;
                    maxLen = end - start + 1;
                }
            }

            end++;
        }

        return maxLen == Integer.MIN_VALUE ? null : input.substring(startId, endId);
    }
}

